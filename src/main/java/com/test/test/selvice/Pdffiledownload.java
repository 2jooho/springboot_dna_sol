/*
package com.test.test.selvice;

import com.test.test.exception.FileDownloadException;
import com.test.test.exception.FileUploadException;
import com.test.test.pdf.jfreechart_test;
import com.test.test.pdf.mixpage;
import com.test.test.pdf.pdf_table;
import com.test.test.property.FileUploadProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static com.test.test.Controll.UserController.create_id;

@Service
public class Pdffiledownload {
    private final Path fileLocation;

    @Autowired

    public Pdffiledownload(FileUploadProperties prop) {
        this.fileLocation = Paths.get("C:/pdf_download")
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileLocation);
        }catch(Exception e) {
            throw new FileUploadException("파일을 업로드할 디렉토리를 생성하지 못했습니다.", e);
        }
    }



public void jfreefile(MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // 파일명에 부적합 문자가 있는지 확인한다.
            if(fileName.contains(".."))
                throw new FileUploadException("파일명에 부적합 문자가 포함되어 있습니다. " + fileName);

            Path targetLocation = this.fileLocation.resolve(fileName);
            jfreechart_test barchart=new jfreechart_test();
            pdf_table pdf_create=new pdf_table();
            mixpage mix=new mixpage();
           mix.addfolder();
            mix.strem();
            barchart.writeChartToPDF2();
           pdf_create.total_pdf();
            mix.addDocument();
          //  Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

        }catch(Exception e) {
            throw new FileUploadException("["+fileName+"] 파일 업로드에 실패하였습니다. 다시 시도하십시오.",e);
        }
}




  public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if(resource.exists()) {
                return resource;
            }else {
                throw new FileDownloadException(fileName + " 파일을 찾을 수 없습니다.");
            }
        }catch(MalformedURLException e) {
            throw new FileDownloadException(fileName + " 파일을 찾을 수 없습니다.", e);
        }
    }


}
*/
