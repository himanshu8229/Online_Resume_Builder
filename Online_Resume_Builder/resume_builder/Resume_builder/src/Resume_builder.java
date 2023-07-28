import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;


public class Resume_builder extends JFrame {
    private JPanel MainPanel;
    private JPanel SubPanel1;
    private JPanel Subpanel2;
    private JPanel SubPanel3;
    private JPanel SubPanel4;
    private JPanel SubPanel6;
    private JPanel SubPanel7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField9;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JLabel Skill;
    private JLabel Certification;
    private JLabel Project;
    private JLabel Education;
    private JButton saveButton;
    JFrame frame=new JFrame();

    public Resume_builder() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(MainPanel);
        frame.pack();
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    try{
                        String nameOfFile="D:\\my\\my.pdf";
                        Document myDocument=new Document();
                        PdfWriter.getInstance(myDocument, new FileOutputStream(nameOfFile));
                       myDocument.open();

                        PdfPTable table=new PdfPTable(2);
                        myDocument.add(new Paragraph(textField1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD,35, Font.BOLD, BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD, 10,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD, 10,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                        myDocument.add(new Paragraph("CONTACT DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.MAGENTA.brighter())));
                        myDocument.add(new Paragraph(textField2.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField3.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField4.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField5.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField6.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));

                        myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                        myDocument.add(new Paragraph("CERTIFICATION",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.MAGENTA.brighter())));


                        myDocument.add(new Paragraph(textField14.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField13.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField12.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField11.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));

                        myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------------------------------------------"));
                        myDocument.add(new Paragraph("SKILLS",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.MAGENTA.brighter())));

                        myDocument.add(new Paragraph(textField10.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField9.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField8.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField7.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));


                        myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------------------------------------------"));
                        myDocument.add(new Paragraph("EDUCATION",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.MAGENTA.brighter())));
                        myDocument.add(new Paragraph("Matriculation",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.DARK_GRAY)));

                        myDocument.add(new Paragraph(textField15.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph("Intermediate",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField16.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph("Other",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField17.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));


                        myDocument.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------------"));
                        myDocument.add(new Paragraph("PROJECTS",FontFactory.getFont(FontFactory.TIMES_BOLD,10, Font.BOLD,BaseColor.MAGENTA.brighter())));

                        myDocument.add(new Paragraph(textField18.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField19.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));
                        myDocument.add(new Paragraph(textField20.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD, 8,BaseColor.DARK_GRAY)));

                        myDocument.close();
                        JOptionPane.showMessageDialog(null,"Resume was Generated");





                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null,ex);
                    }
                }


        });
    }

    public static void main(String[] args) {
       new Resume_builder();


   }
}
