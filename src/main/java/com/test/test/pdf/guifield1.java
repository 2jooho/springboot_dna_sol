package com.test.test.pdf;


/*import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guifield1{
    public static void main(String[] args) throws Exception {
        //Gui관련
        new guifield1();
        //pdf관련

    }

    JTextField name,num;//클래스 변수로 선언
    public static String n;
    public static String number;
    public void input(String n,String number)
    {
        this.n=n;
        this.number=number;
    }

    public String output() {
        return n;
    }
    public String output2() {
        return number;
    }
    public guifield1() throws Exception{
        //new JFrame();생략됨 나자신이니까 쓸수 없음
        JFrame frame=new JFrame("회원정보 입력");
        Dimension dim = new Dimension(500,300);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);//프레임 완전하게 끄기
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setLocation(600, 500);
        frame.setPreferredSize(dim);
        //Layout 배치설정자
        frame.setLayout(new GridLayout(3,2));
        frame.add(new JLabel("PDF폴더 추가, 생성 파일 입니다."));
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("  이 름 :"));
        name=new JTextField(20);
        panel1.add(name);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("  회원번호 :"));
        num =new JTextField(20);
        panel2.add(num);

        frame.add(panel1);
        frame.add(panel2);
        JButton button = new JButton("생성");
        frame.add(button);
        frame.setVisible(true);
        //버튼 리스너 연결
        button.addActionListener(new Listener(frame));

    }

    class Listener implements ActionListener{
        JFrame frame;
        public Listener(JFrame f){
            frame =f;
        }
        @Override
        public void actionPerformed(ActionEvent arg0)  {
            //버튼을 누르면 이쪽으로 제어가 이동

            System.out.println(arg0.getActionCommand());
            String a =name.getText().toString();
            System.out.println(a);
            String b =num.getText().toString();
            System.out.println(b);
            input(a,b);
            jfreechart_test barchart=new jfreechart_test();
            pdf_table pdf_create=new pdf_table();
            mixpage mix =new mixpage();
            try {
                mix.addfolder();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            barchart.writeChartToPDF2();
            try {
                pdf_create.total_pdf();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                mix.addDocument();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //다이얼로그
            JOptionPane.showMessageDialog(frame, n+"("+number+")"+"PDF 생성완료");

        }
    }
}
*/

