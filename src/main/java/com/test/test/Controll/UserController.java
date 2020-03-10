package com.test.test.Controll;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.test.BoardMapper;
import com.test.test.Diseaserepository;
import com.test.test.UserRepository;
import com.test.test.Board.Request;
import com.test.test.Board.Service;
import com.test.test.Board.response;
import com.test.test.Pdfboard.create;
import com.test.test.delivery.kit;
import com.test.test.delivery.maptype;
import com.test.test.domain.Disease;
import com.test.test.domain.UserEntity;
import com.test.test.domain.gene;
import com.test.test.domain.test;
//import com.test.test.pdf.jfreechart_test;
//import com.test.test.pdf.mixpage;
//import com.test.test.pdf.pdf_table;
import com.test.test.selvice.FileUploadDownloadService;
import com.test.test.upload.FileUploadResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//전체적인 부분을 중간에서 컨트롤하는 곳
@Controller
public class UserController {
    public static String create_id;
    @Autowired
    UserRepository userRepository;
    @Autowired
    Diseaserepository kitRepository;
    @Autowired
    private BoardMapper memberDao;
    @Autowired
    FileUploadDownloadService service;

    public UserController() {
    }
    //upload.jsp부분을 띄우기 위해 접속 url get형식으로 구축
    @RequestMapping(
            value = {"/uploadFile"},
            method = {RequestMethod.GET}
    )
    public String upload() {
        return "upload";
    }
//업로드 파일 post형식으로 서버에 저장 다운로드 url 설정
    @PostMapping({"/uploadFile"})
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = this.service.storeFile(file);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/").path(fileName).toUriString();
        new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
        return "redirect:uploadFile";
    }
//여러개 파일 업로드 접속 url
    @RequestMapping(
            value = {"/uploadMultipleFiles"},
            method = {RequestMethod.GET}
    )
    public String uploadmultiple() {
        return "upload";
    }

    @PostMapping({"/uploadMultipleFiles"})
    public String uploadMultipleFiles(@RequestParam("file") MultipartFile[] files) {
        Arrays.asList(files).stream().map(file -> this.uploadFile(file))
        .collect(Collectors.toList());
        return "redirect:uploadMultipleFiles";
    }

    @GetMapping({"/downloadFile/{fileName:.+}"})
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        Resource resource = this.service.loadFileAsResource(fileName);
        String contentType = null;

        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException var6) {
        }

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"attachment; filename=\"" + resource.getFilename() + "\""})).body(resource);
    }

/*
    @RequestMapping(
            value = {"/pdf/create"},
            method = {RequestMethod.GET}
    )
    public String pdf_create() {
        return "pdf_create";
    }

    @RequestMapping(
            value = {"/pdf/create"},
            method = {RequestMethod.POST}
    )
    public String postpdf_create(create create) throws Exception {
        create_id = create.getOrder_id();
        jfreechart_test barchart = new jfreechart_test();
        pdf_table pdf_create = new pdf_table();
        mixpage mix = new mixpage();
        mixpage.addfolder();
        mixpage.strem();
        jfreechart_test.writeChartToPDF2();
        pdf_table.total_pdf();
        mixpage.addDocument();
        return "redirect:url";
    }
*/

  /*  @RequestMapping({"/pdf/url"})
    public String pdf_url() {
        return "pdf_url";
    }*/

  //edgc에 배송 요청 리스트 url
    @RequestMapping({"/list"})
    public String list(Model model) {
        List<Service> list = (List)this.memberDao.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(
            value = {"/add"},
            method = {RequestMethod.GET}
    )
    public String add() {
        return "add";
    }
//~/add에서 입력값을 json형식으로 만들어 edgc에 post로 보내고 list페이지 열기
    @RequestMapping(
            value = {"/add"},
            method = {RequestMethod.POST}
    )
    public String postAdd(Service service) {
        new Request();
        this.memberDao.save(service);
        new HashMap();
        Map<String, Object> map = new HashMap();
        List<Object> arr = new ArrayList();
        Map<String, Object> obj1 = new HashMap();
        obj1.put("partner_id", "");//시크릿 id
        obj1.put("partner_secret", "");//시크릿 코드
        map.put("authentication", obj1);
        new SimpleDateFormat("yyyyMMdd hhmmss");
        Map<String, Object> obj2 = new HashMap();
        obj2.put("order_id", service.getOrder_id());
        obj2.put("order_date", service.getOrder_date());
        Map<String, Object> map2 = new HashMap();
        map2.put("amount", service.getAmount());
        map2.put("unit_price", service.getUnit_price());
        map2.put("currency", service.getCurrency());
        obj2.put("kit", map2);
        Map<String, Object> map3 = new HashMap();
        map3.put("name", service.getName());
        map3.put("phone", service.getPhone());
        map3.put("email", service.getEmail());
        Map<String, Object> map4 = new HashMap();
        map4.put("address_1", service.getAddress_1());
        map4.put("address_2", service.getAddress_2());
        map4.put("post", service.getPost());
        map3.put("shipping", map4);
        obj2.put("user", map3);
        arr.add(obj2);
        map.put("orders", arr);

        String url = "https://보낼 url";// 유전자 업체 url
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(map, headers);
        RestTemplate restTemplate = new RestTemplate();
        String respon = (String)restTemplate.postForObject(url, entity, String.class, new Object[0]);
        ObjectMapper objectMapper = new ObjectMapper();
//성공적으로 보냈을때 띄움
        try {
            Request t = (Request)objectMapper.readValue(respon, Request.class);
            System.out.println("status = " + t.getStatus());
            System.out.println("message = " + t.getMessage());
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(t);
            System.out.println(jsonString);
        } catch (IOException var20) {
            var20.printStackTrace();
        }

        return "redirect:list";
    }

//edgc로 부터 받는json을 풀어서 db에 저장
    @PostMapping({"/edgc/api"})
    @ResponseBody
    public response createUser(@RequestBody UserEntity user) {
        try {
            Map<String, Object> map = user.getorder();
            String order_id = map.get("order_id").toString();
            String barcode = map.get("barcode").toString();
            String download_url = map.get("download_url").toString();
            test test1 = new test(order_id, barcode, download_url);
            new ArrayList();
            List<Map> temp = (List)map.get("disease");

            for(int i = 0; i < temp.size(); ++i) {
                Map<String, Object> tMap = (Map)temp.get(i);
                String name_disease = tMap.get("name").toString();
                String result = tMap.get("result").toString();
                String multiple_score = tMap.get("multiple_score").toString();
                Disease disease1 = new Disease(name_disease, result, multiple_score, test1,test1);
                List<Map> temp2 = (List)tMap.get("gene");

                for(int j = 0; j < temp2.size(); ++j) {
                    Map<String, Object> tMap2 = (Map)temp2.get(j);
                    String name_gene = tMap2.get("name").toString();
                    String ref = tMap2.get("ref").toString();
                    String risk = tMap2.get("risk").toString();
                    String genotype = tMap2.get("genotype").toString();
                    String marker_result = tMap2.get("marker_result").toString();
                    gene gene1 = new gene(name_gene, ref, risk, genotype, marker_result, disease1,disease1);
                    disease1.addgene(gene1);
                    test1.addDisease(disease1);

                }
            }

            this.userRepository.save(test1);
            response success = new response("1", "성공");
            return success;
        } catch (Exception var23) {
            var23.printStackTrace();
            response falsee = new response("0", "실패");
            return falsee;
        }
    }

    @PostMapping({"/edgc/delivery"})
    @ResponseBody
    public response createUser(@RequestBody maptype mapt) {
        try {
            Map<String, Object> map = mapt.getorder();
            String order_id = map.get("order_id").toString();
            Map<String, Object> map2 = (Map)map.get("kit");
            String barcode = map2.get("barcode").toString();
            Map<String, Object> map3 = (Map)map2.get("shipping");
            String status = map3.get("status").toString();
            String tracking_num = map3.get("tracking_num").toString();
            kit kit1 = new kit(order_id, barcode, status, tracking_num);
            this.kitRepository.save(kit1);
            response success = new response("1", "성공");
            return success;
        } catch (Exception var11) {
            var11.printStackTrace();
            response falsee = new response("0", "실패");
            return falsee;
        }
    }
}
