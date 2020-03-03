/*
package com.test.test.pdf;


import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;


import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import org.springframework.core.io.ClassPathResource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.test.test.Controll.UserController.create_id;



public class pdf_table{
    static String id=create_id;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://best54.cafe24.com/best54?serverTimezone=UTC";
    static final String USERNAME = "best54";
    static final String PASSWORD = "medi1607!";

  */
/*  public static void main(String[] asdf)throws Exception{
        total_pdf();
    }*//*





    public void  total_pdf(HttpServletResponse response) throws Exception{



        Document document = new Document(PageSize.A4, 10, 10, 10, 10); // 용지 및 여백 설정
        OutputStream os = null;
        // PdfWriter 생성
        mixpage mix=new mixpage();
        // guifield1 gui=new guifield1();

        //String title=gui.output();
        String filename="(medi)"+id+".pdf";
        */
/*String fileName="C:\\pdf_download\\(medi)";
        response.setContentType("application/pdf");
        response.setHeader("Content-Transper-Encoding", "binary");
        response.setHeader("Content-Disposition", "inline; filename=" + fileName + ".pdf");
        OutputStream out = response.getOutputStream();*//*

       PdfWriter writer = PdfWriter.getInstance(document, response.getOutputStream()); //현재 페이지에 pdf 보여지기

        response.setHeader("Content-Disposition", "attachment; filename="+filename);
        response.setHeader("Content-Transfer-Encoding", "binary");
        response.setContentType("application/pdf");



      // PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("(메디프레소).pdf"));
     */
/*   PdfWriter writer = PdfWriter.getInstance(document,response.getOutputStream()); // 바로 다운로드.
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\jooho\\(메디프레소).pdf"));
        // 파일 다운로드 설정
        response.setContentType("application/pdf");
        String fileName = URLEncoder.encode("(메디프레소)", "UTF-8"); // 파일명이 한글일 땐 인코딩 필요
        response.setHeader("Content-Transper-Encoding", "binary");
        response.setHeader("Content-Disposition", "inline; filename=" + fileName + ".pdf");*//*





        // Document 오픈
        document.open();
        XMLWorkerHelper helper = XMLWorkerHelper.getInstance();

        // CSS

        CSSResolver cssResolver = new StyleAttrCSSResolver();
        CssFile cssFile = helper.getCSS(new FileInputStream("D:\\jooho\\table2.css"));
        cssResolver.addCss(cssFile);
        // HTML, 폰트 설정

        XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        //fontProvider.register("D:\\jooho\\java_lib\\NanumFont_TTF_ALL\\NanumGothicBold.ttf", "NanumGothicBold"); // MalgunGothic은 alias,
        fontProvider.register("D:\\jooho\\font\\NanumFontTTF\\NanumSquareB.ttf", "NanumGothicBold");

*/
/*        XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        //fontProvider.register("D:\\jooho\\java_lib\\NanumFont_TTF_ALL\\NanumGothicBold.ttf", "NanumGothicBold"); // MalgunGothic은 alias,
        fontProvider.register("D:\\jooho\\font\\NanumFontTTF\\NanumSquareB.ttf", "NanumGothicBold");*//*

        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);

        HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());

        // Pipelines
        PdfWriterPipeline pdf = new PdfWriterPipeline(document,writer);
        HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
        CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);

        XMLWorker worker = new XMLWorker(css, true);
        XMLParser xmlParser = new XMLParser(worker, Charset.forName("UTF-8"));
	*/
/*jfreechart_test Chart=new jfreechart_test();
	 PdfContentByte contentByte = writer.getDirectContent();
		PdfTemplate template = contentByte.createTemplate(500, 400);
		Graphics2D graphics2d = template.createGraphics(500, 400,
				new DefaultFontMapper());
		Rectangle2D rectangle2d = new Rectangle2D.Double(20, 10, 260,
				260);
		Chart.generatePieChart().draw(graphics2d, rectangle2d);

		graphics2d.dispose();
		contentByte.addTemplate(template, 0, 400);

		 PdfContentByte contentByte2 = writer.getDirectContent();
			PdfTemplate template2 = contentByte2.createTemplate(500, 400);
			Graphics2D graphics2d2 = template2.createGraphics(500, 400,
					new DefaultFontMapper());
			Rectangle2D rectangle2d2 = new Rectangle2D.Double(20, 10, 260,
					260);
			Chart.generateBarChart().draw(graphics2d2, rectangle2d2);
			graphics2d2.dispose();
			contentByte2.addTemplate(template2, 280, 400);*//*


        // 폰트 설정에서 별칭으로 줬던 "MalgunGothic"을 html 안에 폰트로 지정한다.
        //mix
        String sql0,sql1,sql2,sql3,sql4,sql5,sql6,sql7,sql8,sql9,sql10,sql11,sql12,sql13,sql14;

        String sql_HDL=null,sql_LDL=null,sql_TC=null,sql_body=null,sql_trig=null,sql_glucose=null,sql_pressure=null,sql_skin=null,sql_areata=null,sql_male=null;
        String sql_HDL_result=null,sql_LDL_result=null,sql_TC_result=null,sql_body_result=null,sql_trig_result=null,sql_glucose_result=null,sql_pressure_result=null,sql_skin_result=null,sql_areata_result=null,sql_male_result=null;
        String sql_CaffeineMetabolism_result=null,sql_SkinAging_result=null,sql_SkinElasticity_result=null, sql_HairThickness_result=null, sql_VitaminC_result=null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        String TC=null,HDL=null,LDL=null,body=null, trig=null, glucose=null, pressure=null,skin=null, areata=null,male=null,VitaminC=null,CaffeineMetabolism=null,SkinAging=null;
        String color_TC="black",color_HDL="black",color_LDL="black",color_body="black",color_trig="black",color_glucose="black",color_pressure="black",color_skin="black",color_areata="black",color_male="black",color_CaffeineMetabolism="black",color_SkinAging="black",color_VitaminC="black";
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            sql0="select * from disease_table where order_id=id AND name_disease='TC'";
            sql1="select * from disease_table where order_id=id AND name_disease='Body Mass Index'";
            sql2="select * from disease_table where order_id=id AND name_disease='Triglycerides'";
            sql3="select * from disease_table where order_id=id AND name_disease='Blood Glucose'";
            sql4="select * from disease_table where order_id=id AND name_disease='Blood Pressure'";
            sql5="select * from disease_table where order_id=id AND name_disease='Skin Pigmentation'";
            sql6="select * from disease_table where order_id=id AND name_disease='Alopecia Areata'";
            sql7="select * from disease_table where order_id=id AND name_disease='Male Pattern Baldness'";
            sql8="select * from disease_table where order_id=id AND name_disease='HDL'";
            sql9="select * from disease_table where order_id=id AND name_disease='LDL'";
            sql10="select * from disease_table where order_id=id AND name_disease='Caffeine Metabolism'";
            sql11="select * from disease_table where order_id=id AND name_disease='Skin Aging'";
            sql12="select * from disease_table where order_id=id AND name_disease='Skin Elasticity'";
            sql13="select * from disease_table where order_id=id AND name_disease='Hair Thickness'";
            sql14="select * from disease_table where order_id=id AND name_disease='Vitamin C'";

            String page3_sql="select * from disease_table where order_id='000001'AND result=''\"";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql0);

            if(rs.next())
            {
                sql_TC = rs.getString("multiple_score");
                sql_TC_result = rs.getString("result");
                switch(sql_TC_result) {
                    case "높음":
                        TC=" ▲"; color_TC="red"; break;
                    case "낮음":
                        TC=" ▼"; color_TC="green"; break;
                    default:
                        TC=" -";
                }
            }

            rs = stmt.executeQuery(sql1);
            if(rs.next())
            {
                sql_body = rs.getString("multiple_score");
                sql_body_result = rs.getString("result");
                switch(sql_body_result) {
                    case "높음":
                        body=" ▲"; color_body="red"; break;
                    case "낮음":
                        body=" ▼"; color_body="green"; break;
                    default:
                        body=" -";
                }
            }
            rs = stmt.executeQuery(sql2);
            if(rs.next())
            {
                sql_trig = rs.getString("multiple_score");
                sql_trig_result = rs.getString("result");
                switch(sql_trig_result) {
                    case "높음":
                        trig=" ▲"; color_trig="red"; break;
                    case "낮음":
                        trig=" ▼"; color_trig="green"; break;
                    default:
                        trig=" -";
                }
            }
            rs = stmt.executeQuery(sql3);
            if(rs.next())
            {
                sql_glucose = rs.getString("multiple_score");
                sql_glucose_result = rs.getString("result");
                switch(sql_glucose_result) {
                    case "높음":
                        glucose=" ▲"; color_glucose="red"; break;
                    case "낮음":
                        glucose=" ▼"; color_glucose="green"; break;
                    default:
                        glucose=" -";
                }
            }
            rs = stmt.executeQuery(sql4);
            if(rs.next())
            {
                sql_pressure = rs.getString("multiple_score");
                sql_pressure_result = rs.getString("result");
                switch(sql_pressure_result) {
                    case "높음":
                        pressure=" ▲"; color_pressure="red"; break;
                    case "낮음":
                        pressure=" ▼"; color_pressure="green"; break;
                    default:
                        pressure=" -";
                }
            }
            rs = stmt.executeQuery(sql5);
            if(rs.next())
            {
                sql_skin = rs.getString("multiple_score");
                sql_skin_result = rs.getString("result");
                switch(sql_skin_result) {
                    case "높음":
                        skin=" ▲"; color_skin="red"; break;
                    case "낮음":
                        skin=" ▼"; color_skin="green"; break;
                    default:
                        skin=" -";
                }
            }
            rs = stmt.executeQuery(sql6);
            if(rs.next())
            {
                sql_areata = rs.getString("multiple_score");
                sql_areata_result = rs.getString("result");
                switch(sql_areata_result) {
                    case "높음":
                        areata=" ▲"; color_areata="red"; break;
                    case "낮음":
                        areata=" ▼"; color_areata="green"; break;
                    default:
                        areata=" -";
                }
            }

            rs = stmt.executeQuery(sql7);
            if(rs.next())
            {
                sql_male = rs.getString("multiple_score");
                sql_male_result = rs.getString("result");
                switch(sql_male_result) {
                    case "높음":
                        male=" ▲"; color_male="red"; break;
                    case "낮음":
                        male=" ▼"; color_male="green"; break;
                    default:
                        male=" -";
                }
            }
            rs = stmt.executeQuery(sql8);
            if(rs.next())
            {
                sql_HDL = rs.getString("multiple_score");
                sql_HDL_result = rs.getString("result");
                switch(sql_HDL_result) {
                    case "높음":
                        HDL=" ▲"; color_HDL="red"; break;
                    case "낮음":
                        HDL=" ▼"; color_HDL="green"; break;
                    default:
                        HDL=" -";
                }
            }
            rs = stmt.executeQuery(sql9);
            if(rs.next())
            {
                sql_LDL = rs.getString("multiple_score");
                sql_LDL_result = rs.getString("result");
                switch(sql_LDL_result) {
                    case "높음":
                        LDL=" ▲"; color_LDL="red"; break;
                    case "낮음":
                        LDL=" ▼"; color_LDL="green"; break;
                    default:
                        LDL=" -";
                }
            }

            rs = stmt.executeQuery(sql10);
            if(rs.next())
            {
                sql_CaffeineMetabolism_result = rs.getString("result");
                switch(sql_CaffeineMetabolism_result) {
                    case "높음":
                        CaffeineMetabolism=" ▲"; color_CaffeineMetabolism="red"; break;
                    case "낮음":
                        CaffeineMetabolism=" ▼"; color_CaffeineMetabolism="green"; break;
                    default:
                        CaffeineMetabolism=" -";
                }
            }
            rs = stmt.executeQuery(sql11);
            if(rs.next())
            {
                sql_SkinAging_result = rs.getString("result");
                switch(sql_SkinAging_result) {
                    case "높음":
                        SkinAging=" ▲"; color_SkinAging="red"; break;
                    case "낮음":
                        SkinAging=" ▼"; color_SkinAging="green"; break;
                    default:
                        SkinAging=" -";
                }
            }
            rs = stmt.executeQuery(sql12);
            if(rs.next())
            {
                sql_SkinElasticity_result = rs.getString("result");
            }
            rs = stmt.executeQuery(sql13);
            if(rs.next())
            {
                sql_HairThickness_result = rs.getString("result");
            }

            rs = stmt.executeQuery(sql14);
            if(rs.next())
            {
                sql_VitaminC_result = rs.getString("result");
                switch(sql_VitaminC_result) {
                    case "높음":
                        VitaminC=" ▲"; color_VitaminC="red"; break;
                    case "낮음":
                        VitaminC=" ▼"; color_VitaminC="green"; break;
                    default:
                        VitaminC=" -";
                }
            }
        }catch (SQLException e) {
            System.out.println("SQL Error : " + e.getMessage());
        } catch (ClassNotFoundException e1) {
            System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
        }

        String b="체질량";
        String a="    <tr><td>"+b+"</td><td><font size='4'>MC4R</font> (식욕과 포만감을 조절하는 유전자)</td><td>C</td><td>CC</td><td >높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" ;
        String htmlStr ="<html>"
                +"<head>"
                +"</head>"
                + "<body style='font-family: NanumGothicBold;'class='down'>"

                +"<img src='D:\\jooho\\html_image\\DNA\\title0.jpg'>"
                +"</img>"
                +"<div class='toptitle'>"
                +"<div class='line'>"
                +"</div>"
                +"<div class='line2'>"
                +"<p class='text3'>&nbsp;&nbsp;유전자 검사 결과 그래프</p>"
                +"</div>"
                +"</div>"
                +"<img src='"+mix.addfolder()+"\\(이미지).jpeg' class='chart'>"
                // +"<img src='D:\\jooho\\(이미지).jpeg' class='chart'>"
                +"</img>"

                +"<div class='toptitle2'>"
                +"<div class='line'>"
                +"</div>"
                +"<div class='line2'>"
                +"<p class='text3'><span style='font-size:20px'>&nbsp;&nbsp;당신의 유전자 <span style='font-weight:bold;'>레벨은?</span>&nbsp;&nbsp;<span style='font-size:25px;color:#fdbf6a;font-weight:bold;'>Levle 2 </span></span></p>"
                +"</div>"
                +"</div>"

                +"<div class='line3' ></div>"

                +"<div class='toptitle3'>"
                +"<div class='line'>"
                +"</div>"
                +"<div class='line2'>"
                +"<p class='text3'>&nbsp;&nbsp;&nbsp;유전자 검사 결과표</p>"
                +"</div>"
                +"</div>"

                +"<table class='table1'> "
                + "<tbody class='simple_table'>"
                +  "<tr class='tr1'> "+
                "	<th class='th1' colspan='2' width:'50%'> "+
                "	검사 항목"+
                "	</th>"+
                "	<th class='th1' width='80px'>"+
                "	나의 유전자 수치"+
                "	</th>"+
                "	<th class='th1' width='80px'>"+
                "	검사 결과"+
                "	</th>"+
                "	<th class='th1' width='80px'>"+
                "	나의 점수"+
                "	</th>"+
                "	</tr>"+
                "     <tr class='tr1'>"+
                "	        <td class='td1' width= '100px' rowspan='3'><font size='3'>콜레스테롤</font></td>"+
                "           <td class='td1'> <font size='3'>총콜레스테롤(Total Cholesterol)</font></td>"+
                "           <td class='td1-1'  text-align='center'>"+ sql_TC +"</td>"+
                "            <td class='td1-1' >"+sql_TC_result+" &nbsp;&nbsp; <span style='color:"+color_TC+";'>"+TC+"</span></td>"+
                "            <td class='td1-1' > 50점</td>"+
                "	      </tr>"+
                "       <tr  class='tr1'>"+
                "	         <td class='td1'><font size='3'>고밀도 콜레스테롤(HDL Cholesterol)</font></td>"+
                "            <td class='td1-1' >"+ sql_HDL+"</td>"+
                "            <td class='td1-1' >"+sql_HDL_result+" &nbsp;&nbsp;&nbsp; <span style='color:"+color_HDL+";'>"+HDL+"</span></td>"+
                "            <td class='td1-1' > 90점</td>"+
                "	        </tr>"+
                "	        <tr class='tr1'>"+
                "	           <td class='td1'><font size='3'>저밀도 콜레스테롤(LDL Cholesterol)</font></td>"+
                "           <td class='td1-1' >"+ sql_LDL+"</td>"+
                "            <td class='td1-1' >"+sql_LDL_result+"&nbsp;&nbsp;&nbsp; <span style='color:"+color_LDL+";'>"+LDL+"</span></td>"+
                "            <td class='td1-1' > 80점</td>"+
                "    </tr>"+
                " <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3' >체질량 지수 (Body Mass Index, BMI)</font></td>"+
                "           <td class='td1-1' > "+sql_body+"</td>"+
                "           <td class='td1-1'>"+sql_body_result+" &nbsp;&nbsp;&nbsp; <span style='color:"+color_body+";'>"+body+"</span></td>"+
                "   <td class='td1-1' > 50점</td>"+
                "  </tr>"+
                "   <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3'>중성지방 (Triglycerides)</font></td>"+
                "           <td class='td1-1' > "+sql_trig+"</td>"+
                "           <td class='td1-1' >"+sql_trig_result+"&nbsp;&nbsp;&nbsp; <span style='color:"+color_trig+";'>"+trig+"</span></td>"+
                "    <td class='td1-1' > 59점</td>"+
                "   </tr>"+
                "   <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3' >혈당(Blood Glucose)</font></td>"+
                "           <td class='td1-1' > "+ sql_glucose +"</td>"+
                "           <td class='td1-1' >"+sql_glucose_result+"&nbsp;&nbsp;&nbsp; <span style='color:"+color_glucose+";'>"+glucose+"</span></td>"+
                "   <td class='td1-1' > 70점</td>"+
                "  </tr>"+
                " <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3' >혈압(Blood Pressure)</font></td>"+
                "          <td class='td1-1' > "+ sql_pressure +"</td>"+
                "          <td class='td1-1' >"+sql_pressure_result+" &nbsp;&nbsp;&nbsp; <span style='color:"+color_pressure+";'>"+pressure+"</span></td>"+
                "   <td class='td1-1' > 60점</td>"+
                "  </tr>"+
                "  <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3' >피부색소침착 (Skin Pigmentation)</font></td>"+
                "         <td class='td1-1' >"+sql_skin +"</td>"+
                "          <td class='td1-1' >"+sql_skin_result+"&nbsp;&nbsp;&nbsp;<span style='color:"+color_skin+";'>"+skin+"</span></td>"+
                "  <td class='td1-1' > 63점</td>"+
                "  </tr>"+
                "  <tr class='tr1'>"+
                "    <td class='td1' colspan='2'><font size='3' >남성형 탈모 (Male Pattern Baldness)</font></td>"+
                "           <td class='td1-1' >"+ sql_male+"</td>"+
                "           <td class='td1-1' >"+sql_male_result+"&nbsp;&nbsp;&nbsp; <span style='color:"+color_male+";'>"+male+"</span></td>"+
                "     <td class='td1-1' > 65점</td>"+
                "   </tr>"+
                "  <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3' >원형 탈모 (Alopecia Areata)</font></td>"+
                "           <td class='td1-1' > "+sql_areata+"</td>"+
                "           <td class='td1-1' >"+sql_areata_result+"&nbsp;&nbsp;&nbsp;<span style='color:"+color_areata+";'>"+areata+"</span></td>"+
                "    <td class='td1-1' > 48점</td>"+
                " </tr>"+
                "  <tr class='tr1'>"+
                "<td class='td1' colspan='2'><font size='3'>카페인 대사(Caffeine Metabolism)</font></td>"+
                "           <td class='td1-1' colspan='2' > "+sql_CaffeineMetabolism_result+"&nbsp;&nbsp;&nbsp; <span style='color:"+color_CaffeineMetabolism+";'>"+CaffeineMetabolism+"</span></td>"+
                "              <td class='td1-1' > 65점</td>"+
                "  </tr>"+
                "    <tr class='tr1'>"+
                "   <td class='td1' colspan='2'><font size='3'>피부 노화 (Skin Aging)</font></td>"+
                "           <td class='td1-1' colspan='2' > "+sql_SkinAging_result+"&nbsp;&nbsp;&nbsp; <span style='color:"+color_SkinAging+";'>"+SkinAging+"</span></td>"+
                "               <td class='td1-1' > 80점</td>"+
                "  </tr>"+
                "   <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3'>피부 탄력 (Skin Elasticity)</font></td>"+
                "           <td class='td1-1' colspan='2' > "+sql_SkinElasticity_result+"&nbsp;&nbsp;&nbsp;</td>"+
                "               <td class='td1-1'> 40점</td>"+
                "  </tr>"+
                "   <tr class='tr1'>"+
                " <td class='td1' colspan='2'><font size='3'>모발 굵기 (Hair Thickness)</font></td>"+
                "           <td class='td1-1' colspan='2' > "+sql_HairThickness_result+"&nbsp;&nbsp;&nbsp;</td>"+
                "               <td class='td1-1'> 99점</td>"+
                " </tr>"+
                "  <tr class='tr1'>"+
                "  <td class='td1' colspan='2'><font size='3'>비타민 C (Vitamin C)</font></td>"+
                "           <td class='td1-1' colspan='2' > "+sql_VitaminC_result+"&nbsp;&nbsp;&nbsp;<span style='color:"+color_VitaminC+";'>"+VitaminC+"</span></td>"+
                "               <td class='td1-1'  > 30점</td>"+
                "</tr>"+
                "	    </tbody>"+
                "</table>"


                +"<img src='D:\\jooho\\html_image\\DNA\\title0.jpg'>"
                +"</img>"
                +"<div class='level'>"
                +"<div class='level_text'><p>네가지 레벨이란?</p></div>"
                +"<div class='level_text2'><p>항목별 유전자에 점수를 매겨 각각 뷰티, 헬스, 모발쪽 점수를 나타내 수검자의 관리 중요성과 솔루션 방향을 나타냅니다."
                +"	각 레벨별, 항목별, 점수별 식단추천, 제품추천, 관리항목이 달라지니 평소 집중적인 관리에 도움이 되고자 합니다.</p></div>"
                +"</div>"
                +"<hr class='hr1'></hr>"
                +" <table class='hidden'>"
                +"<tr><td class='td3'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level1.png' class='level1'>"
                +"</img>"
                +"</td>"
                +"<td class='yang_td'>"
                +"<div>"
                +"<div class='level1_title'>"
                +"<p>Level  1</p></div>"
                +"<div style='float:left;'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level1네모.png'style='width:100px;height:20px;'></img></div>"
                +"</div>"
                +"<p class='consti_p'>"
                +"level 1는 dna검사 결과 health, hair, skin 분야 모두 양호하며, 각각의 유전자를 분석했을때 위험인자 유전자형이 많지 않습니다. \r\n" +
                "유전자 상으로는 질병이나 피부, 모발 전반적으로 이상증상이 생길 가능성이 낮다고 판단됩니다. 12가지 검사분야에 유전자 결과가 대부분 평균치를\r\n" +
                "가지고 있습니다. 하지만 질병이나 외형은 유전적 요인과 생활방식, 환경적 요인의 복합적인 상호작용에 의해 최종적으로 결정되니 생활방식과\r\n" +
                "환경적 요인도 중요합니다."
                +"</p>"
                +"<hr width='100%'></hr>"
                +"</td>"
                +"</tr>"
                +"</table>"

                +" <table class='hidden'>"
                +"<tr><td class='td3'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level2.png' class='level1'>"
                +"</img>"
                +"</td>"
                +"<td class='yang_td'>"
                +"<div>"
                +"<div class='level1_title'>"
                +"<p style='color:#fdbf6a;'>Level  2</p></div>"
                +"<div style='float:left;'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level2네모.png'style='width:100px;height:20px;'></img></div>"
                +"</div>"
                +"<p class='consti_p'>"
                +"level 2는 dna검사 결과  health, hair, skin 분야 에서 관심이 있으며, 각각의 유전자를 분석했을때 위험인자 유전자형이 섞여있습니다.\r\n" +
                "유전자 상으로는 질병이나 피부, 모발 부분에서 이상증상이 생길 가능성이 있다고 판단됩니다. 12가지 검사분야중 관심분야에 유전자 결과가 평균이나 높음을 가지고 있습니다.\r\n" +
                "질병이나 외형은 유전적 요인과 생활방식, 환경적 요인의 복합적인 상호작용에 의해 최종적으로 결정되니 관심분야에 대해서 관리가 필요합니다. \r\n" +
                "생활방식, 식단, 운동 등을 통해서 미리 예방하는 것을 추천합니다."
                +"</p>"
                +"<hr width='100%'></hr>"
                +"</td>"
                +"</tr>"
                +"</table>"

                +" <table class='hidden'>"
                +"<tr><td class='td3'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level3.png' class='level1'>"
                +"</img>"
                +"</td>"
                +"<td class='yang_td'>"
                +"<div>"
                +"<div class='level1_title'>"
                +"<p style='color:#f3743e;'>Level  3</p></div>"
                +"<div style='float:left;'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level3네모.png'style='width:100px;height:20px;'></img></div>"
                +"</div>"
                +"<p class='consti_p'>"
                +"level 3는 dna검사 결과  health, hair, skin 분야 에서 주의가 있으며, 각각의 유전자를 분석했을때 위험인자 유전자형이 섞여있습니다.\r\n" +
                "유전자 상으로는 질병이나 피부, 모발 부분에서 이상증상이 생길 가능성이 비교적 있다고 판단됩니다. 12가지 검사분야중 관심, 주의분야에 유전자 결과가 평균이나 높음을 가지고 있습니다.\r\n" +
                "질병이나 외형은 유전적 요인과 생활방식, 환경적 요인의 복합적인 상호작용에 의해 최종적으로 결정되니 관심, 주의분야에 대해서 철저한 관리가 필요합니다. \r\n" +
                "생활방식, 식단, 운동, 제품 등을 통해서 미리 예방하는 것을 추천합니다."
                +"</p>"
                +"<hr width='100%'></hr>"
                +"</td>"
                +"</tr>"
                +"</table>"

                +" <table class='hidden'>"
                +"<tr><td class='td3'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level4.png' class='level1'>"
                +"</img>"
                +"</td>"
                +"<td class='yang_td'>"
                +"<div>"
                +"<div class='level1_title'>"
                +"<p style='color:#f15b4e;'>Level  4</p></div>"
                +"<div style='float:left;'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\Level4네모.png'style='width:100px;height:20px;'></img></div>"
                +"</div>"
                +"<p class='consti_p'>"
                +"level 4는 dna검사 결과  health, hair, skin 분야 에서 주의가 있으며, 각각의 유전자를 분석했을때 위험인자 유전자형이 상당수 섞여있습니다.\r\n" +
                "유전자 상으로는 질병이나 피부, 모발 부분에서 이상증상이 생길 가능성이 비교적 높다고 판단됩니다. 12가지 검사분야중 관심, 주의분야에 유전자 결과가 평균이나 높음을 가지고 있습니다.\r\n" +
                "질병이나 외형은 유전적 요인과 생활방식, 환경적 요인의 복합적인 상호작용에 의해 최종적으로 결정되니 관심, 주의분야에 대해서 철저한 관리가 필요합니다. \r\n" +
                "생활방식, 식단, 운동, 제품, 상담 등을 통해서 미리 예방하는 것을 추천합니다."
                +"</p>"
//+"<hr width='100%'></hr>"
                +"</td>"
                +"</tr>"
                +"</table>"



                //3페이지
                +"<img src='D:\\jooho\\html_image\\DNA\\title0.jpg'>"
                +"</img>"
                +"<div class='toptitle4'>"
                +"<div class='line'>"
                +"</div>"
                +"<div class='line2'>"
                +"<p class='text3'>&nbsp;&nbsp;위험 유전자 결과표</p>"
                +"</div>"
                +"</div>"



                +" <table class=\"table2\">" +
                "    <tr><th>검사 항목</th><th>유전자</th><th>위험인자</th><th>수검자 유전자</th><th>결과</th></tr>" +
                "    <tr><td>체질량</td><td><font size='4'>MC4R</font> (식욕과 포만감을 조절하는 유전자)</td><td>C</td><td>CC</td><td >높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "   <tr><td rowspan='3'>중성지방</td><td><font size='4'>ANGPTL3</font> (혈관 생성과 지질 대사에 중요한 유전자)</td><td>T</td><td>TT</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "<tr><td><font size='4'>BAZ1B</font> (혈중 중성지방 수치 관련 유전자)</td><td>G</td><td>GG</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "<tr><td><font size='4'>DOCK7 (1)</font> (혈중 중성지방과 콜레스테롤 관련 유전자) </td><td>T</td><td>TT</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "    <tr><td>콜레스테롤</td><td><font size='4'>CELSR2</font> (전체 콜레스테롤과 저밀도 콜레스테롤 관련 유전자)</td><td>C</td><td>CC</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "   <tr><td rowspan='3'>혈당</td><td><font size='4'>CDKN2A/B</font> (인슐린을 생산하는 베타세포의 기능,재생 유전자)</td><td>T</td><td>TT</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "<tr><td><font size='4'>DGKB-TMEM195</font> (지방 대사 관여 유전자)</td><td>T</td><td>TT</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "<tr><td><font size='4'>G6PC2</font> (혈당 조절에 관한 유전자)</td><td>C</td><td>CC</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "   <tr><td rowspan='3'>혈압</td><td><font size='4'>CSK</font> (혈관 평활근세포의 수축 관여 유전자)</td><td>C</td><td>CC</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "<tr><td><font size='4'>CYP17A1</font> (단백질 스테로이드 호르몬 합성 유전자)</td><td>A</td><td>AA</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "<tr><td><font size='4'>FGF5 </font> (고혈압 높음도 관련 유전자)</td><td>T</td><td>TT</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "    <tr><td>피부탄력</td><td><font size='4'>MMP1</font> (콜라겐 분해 효소 유전자)</td><td>I</td><td>II</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "    <tr><td>색소침착</td><td><font size='4'>OCA2 (1)</font> (색소 침착과 멜라닌 생성 유전자)</td><td>C</td><td>CC</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "    <tr><td>남성형 탈모</td><td><font size='4'>chr20p11 (2)</font> (남성형 탈모 발생 유전자)</td><td>T</td><td>TT</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                "    <tr><td>비타민 C</td><td><font size='4'>SLC23A1</font> (비타민C 체내 흡수 전달 관련 유전자)</td><td>G</td><td>GG</td><td class='danger'>높음<span style='color:#e55346;'>&nbsp;&nbsp;&nbsp;▲</span></td></tr>" +
                a+
                "  </table>    "


                +"<div class='toptitle3'>"
                +"<div class='line'>"
                +"</div>"
                +"<div class='line2'>"
                +"<p class='text3'>&nbsp;&nbsp;수검자 총평</p>"
                +"</div>"
                +"</div>"
                +" <table class='table3'>"
                +"<tr><td class='td3'>"
                +"<img src='D:\\jooho\\html_image\\DNA\\level2.png' class='consti'>"
                +"</img>"
                +"</td>"
                +"<td class='td3-1'>"
                +"<p class='consti_p'>"
                +"홍길동 님은 폭식이나 과식을 할 것으로 예상되며 식사 전 충분한 수분 섭취와 규칙적인 식사가 중요합니다. 혈장 내의 중성지방 수치는 정상입니다. 하지만 지질대사에 관여하는 유전자들이 높음 수준을 나타내므로 "
                + "중성지방이 쉽게 쌓일 가능성이 있습니다. 따라서 규칙적인 운동을 하시는 걸 추천합니다. 콜레스테롤은 비교적 평균 수준을 보여 관리 수준을 추천합니다. 혈액 내 포도당이 평균보다 많이 분비됩니다. 때문에 인슐린과 같은 혈당 조절 호르몬이 중요합니다. 하지만 홍길동 님은 인슐린 생산 관여 유전자와 지방 대사 유전자, 혈당 조절 유전자가 높음 수준입니다. "
                + "평소 식단 관리를 철저히 하여야 하며 규칙적인 식사와 꾸준한 운동을 추천합니다. 혈압은 평균을 보입니다. 하지만 고혈압을 일으킬 수 있는 유전자가 높음 수준에 있습니다. 저혈압보다는 고혈압을 주의하며 평소 미지근한 물을 자주 마시는 것을 추천합니다."
                + "피부의 재생성, 노화, 수분에 관여하는 콜라겐을 분해하는 유전자가 높음 수준에 있습니다. 이는 콜라겐이 빠르게 분해되어 노화 촉진, 재생성 감소, 탄력감소 등 피부 전반적으로 안 좋은 영향을 미칠 수 있습니다. 따라서 평소 물을 자주 마시고 햇빛 노출을 삼가며 꾸준한 관리를 요구합니다."
                + " 색소침착과 관련된 멜라닌 생성 유전자가 높음 수준에 있습니다. 이는 기미,주근 깨, 피부암 등을 발생시킬 수 있습니다. 평소 자외선 노출을 자제하고 선크림, 팩으로 관리를 추천합니다. 남성형 탈모 발생 가능성은 평균입니다. 하지만 높음 유전자가 있으니 관심을 추천합니다. 혈장 내 비타민c 농도가 낮습니다. 비타민c를 체내로 전달하는 수송체 유전자가 높음 수준입니다. "
                + "많은 양의 비타민보다는 매일 꾸준한 비타민 섭취를 추천합니다. "
                +"</p>"
                +"</td>"
                +"</tr>"
                +"</table>"

                //4페이지
                +"<div style='line-height:0px; '>"
                +"<img src='D:\\jooho\\html_image\\DNA\\title0.jpg'></img></div>"
                +"<div class='level' style='height:170px;'>"
                +"<div class='level_text'><p>홍길동님의 맞춤 식품 분석 결과</p></div>"
                +"<div class='level_text2'><p>홍길동 님에게 추천되는 맞춤 식품은 해당 레벨을 통해 전체적인 식품군이 생성되었으며 추천도는 추천, 보통, 비추천으로 나누었습니다. " +
                "추천도에 따라서 다른 맞춤식품들 보다 좀 더 적극적으로 섭취를 권장하거나 제한드리는 식품 정보입니다. 권장되는 식품은 초록색, 제한되는 식품은 빨간색입니다. 식단을 " +
                "잘 관리하여 건강한 삶을 만들 수 있습니다.</p></div>"
                +"</div>"

                +"<table class=\"page4\">" +
                "    <tr>" +
                "        <td class='page4_td1'>식품군</td><td class='page4_td'>추천식품</td><td class='page4_td'>추천도</td> <td class='page4_td1'>식품군</td><td class='page4_td'>추천식품</td><td class='page4_td'>추천도</td>" +
                "    </tr>" +
                "</table>"
                +"<table class=\"type05\">" +
                "    <tr>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\곡류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>곡류</p> </th>" +
                "        <td>내용이 들어갑니다.</td>  <td>추천도</td>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\유제품류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>유제품류</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
                "    </tr>" +
                "    <tr>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\당류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>당류</p></th>" +
                "        <td class='bad'>설탕</td> <td><img src='D:\\jooho\\html_image\\비추천.png' class='goodimg'></img></td>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\어패류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>어패류</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +

                "    </tr>" +
                "    <tr>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\견과류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>견과류</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\음료.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>음료</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
                "    </tr>" +
                "    <tr>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\버섯류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>버섯류</p></th>" +
                "        <td class='good'>말린 목이버섯</td> <td><img src='D:\\jooho\\html_image\\추천.png' class='goodimg'></img></td>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\채소류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>채소류</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
                "    </tr>" +
                "    <tr>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\육류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>육류</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
                "        <th scope=\"row\"><img src='D:\\jooho\\html_image\\과실류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>과실류</p></th>" +
                "        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
                "    </tr>" +

	*/
/*
	"    <tr>" +
	"        <th scope=\"row\"><img src='D:\\jooho\\html_image\\해조류.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>해조류</p></th>" +
	"        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
	"    </tr>" +
	"    <tr>" +
	"        <th scope=\"row\"><img src='D:\\jooho\\html_image\\기타.jpg' class='food1'></img><p class='text' style='margin-top:15px;'>기타</p></th>" +
	"        <td>내용이 들어갑니다.</td> <td>추천도</td>" +
	"    </tr>" + *//*


                "</table>"
                +"</body>"+
                "</html>";


        StringReader strReader = new StringReader(htmlStr);
        xmlParser.parse(strReader);

        document.close();
        writer.close();
  //  return new File(String.valueOf(writer));
    }

}

*/
