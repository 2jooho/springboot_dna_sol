/*
package com.test.test.pdf;



import java.io.IOException;
import java.awt.Color;
import java.awt.Frame;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lowagie.text.pdf.PdfReader;

import com.test.test.Controll.UserController;
import com.test.test.Pdfboard.create;
import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.*;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;

import static com.test.test.Controll.UserController.create_id;
import static javafx.application.Platform.exit;


public class mixpage {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://best54.cafe24.com/best54?serverTimezone=UTC";
    static final String USERNAME = "best54";
    static final String PASSWORD = "medi1607!";
   static String sql_url=null;
    static String sql_url2=null;
    static String fileName=null;
    final static int size = 1024;
    public Map<Integer,String> gene = new HashMap<Integer, String>();
    public void gene2me() {
        //gene.compute(1, "T")

    }

  */
/*  public static void main(String[] args) throws Exception {
        jfreechart_test barchart=new jfreechart_test();
        pdf_table pdf_create=new pdf_table();

        addfolder();
        strem();

        barchart.writeChartToPDF2();
        pdf_create.total_pdf();
        addDocument();
    }*//*


    public static void strem(HttpServletResponse response) throws Exception  {
            String sql0=null;
        String sql1=null;
        String id=create_id;
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            create create=new create();


            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

                sql0="select * from order_table where order_id="+id;

                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql0);
                if(rs.next())
                {
                    sql_url = rs.getString("download_url");

                }
            }catch (SQLException e) {
                System.out.println("SQL Error : " + e.getMessage());
            } catch (ClassNotFoundException e1) {
                System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
            }


        try(InputStream in = new URL(sql_url).openStream()) {
            String filename="(edgc)"+id+".pdf";
            Files.copy(in, (Path) response.getOutputStream(), StandardCopyOption.REPLACE_EXISTING);
            response.setHeader("Content-Disposition", "attachment; filename="+filename);
            response.setHeader("Content-Transfer-Encoding", "binary");
            response.setContentType("application/pdf");

        }
        rs.close();
        stmt.close();
        conn.close();
    }
    public static Path addfolder() throws Exception {
          String id=create_id;
        // guifield1 gui=new guifield1();
        // String title=gui.output();
        //create create=new create();
        // String title=create.getOrder_id();

        Path path = Paths.get("C:/pdf_download").toAbsolutePath().normalize();
        Files.createDirectories(path);

      */
/*  File Folder = new File(path);
        if (!Folder.exists()) {
            try{
                Folder.mkdir(); //폴더 생성합니다.
                System.out.println("폴더가 생성되었습니다.");
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }else {
            System.out.println("이미 폴더가 생성되어 있습니다.");
        }*//*

        return path;
    }
    public static void addDocument(HttpServletResponse response) throws Exception {
        // guifield1 gui=new guifield1();
        // String title=gui.output();
        // create create=new create();
        //String title=create.getOrder_id();
        // String url=create.getDownload_url();
        String id=create_id;

        String src = "(edgc)"+id+".pdf";
        String src2 = "(medi)"+id+".pdf";
        File file1 = new File(src);
        PDDocument doc1 = PDDocument.load(file1);
        //PdfReader doc1=new PdfReader(new URL(src).openStream());
        File file2 = new File(src2);
        PDDocument doc2 = PDDocument.load(file2);

        //new pdf
        PDDocument doc_new = new PDDocument();

        //Setting the destination pdfDoc
        for(int i=0;i<=2;i++) {
            if(doc1.getPage(i)!=null)doc_new.addPage(doc1.getPage(i));
        }
        if(doc2.getPage(0)!=null)doc_new.addPage(doc2.getPage(0));
        if(doc2.getPage(1)!=null)doc_new.addPage(doc2.getPage(1));
        for(int i=3;i<=19;i++) {
            if(doc1.getPage(i)!=null)doc_new.addPage(doc1.getPage(i));
        }
        if(doc2.getPage(2)!=null)doc_new.addPage(doc2.getPage(2));
        if(doc2.getPage(3)!=null)doc_new.addPage(doc2.getPage(3));
        //save pdfDoc

        doc_new.save(  "(종합버전).pdf");

        System.out.println("Document saved");
        //Closing the documents
        doc_new.close();
        doc1.close();
        doc2.close();


    }

}*/
