package lms;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UpdateView extends JPanel {

    private final JLabel lab1=new JLabel("Title");
    private final JLabel lab2=new JLabel("Author Name");
    private final JLabel lab3=new JLabel("Enter New Data");
    private final JLabel lab4=new JLabel("");
    private final JLabel lab5=new JLabel("Title");
    private final JLabel lab6=new JLabel("Author Name");
    private final JLabel lab7=new JLabel("Edition");
    private final JLabel lab8=new JLabel("Publisher");
    private final JLabel lab9=new JLabel("Publish Date");
    private final JLabel lab10=new JLabel("Publisher Number");
    private final JLabel lab11=new JLabel("Price");
    private final JLabel lab12=new JLabel("Author Number");
    private final JLabel lab13=new JLabel("Company Name");
    private final JLabel lab14=new JLabel("Id");
    private final JLabel lab15=new JLabel("Pages");
    private final JLabel lab16=new JLabel("Main Article");
    private final JLabel lab17=new JLabel("Approved By");
    private final JLabel lab18=new JLabel("Articles");
    private final JLabel lab19=new JLabel("Copies");
    private final JTextField text1=new JTextField();
    private final JTextField text2=new JTextField();
    private final JTextField text5=new JTextField();
    private final JTextField text6=new JTextField();
    private final JTextField text7=new JTextField();
    private final JTextField text8=new JTextField();
    private final JTextField text9=new JTextField();
    private final JTextField text10=new JTextField();
    private final JTextField text11=new JTextField();
    private final JTextField text12=new JTextField();
    private final JTextField text13=new JTextField();
    private final JTextField text14=new JTextField();
    private final JTextField text15=new JTextField();
    private final JTextField text16=new JTextField();
    private final JTextField text17=new JTextField();
    private final JTextField text18=new JTextField();
    private final JTextField text19=new JTextField();
    private final JButton btnUpdate=new JButton("Update");
    private final JButton btnCancel=new JButton("Cancel Update");

    public UpdateView(GUI controller) {
        super(new BorderLayout());
        JPanel topPanel=new JPanel(new GridLayout(18,2));
        topPanel.add(lab1);
        topPanel.add(text1);
        topPanel.add(lab2);
        topPanel.add(text2);
        topPanel.add(lab3);
        topPanel.add(lab4);
        topPanel.add(lab5);
        topPanel.add(text5);
        topPanel.add(lab6);
        topPanel.add(text6);
        topPanel.add(lab7);
        topPanel.add(text7);
        topPanel.add(lab8);
        topPanel.add(text8);
        topPanel.add(lab9);
        topPanel.add(text9);
        topPanel.add(lab10);
        topPanel.add(text10);
        topPanel.add(lab11);
        topPanel.add(text11);
        topPanel.add(lab12);
        topPanel.add(text12);
        topPanel.add(lab13);
        topPanel.add(text13);
        topPanel.add(lab14);
        topPanel.add(text14);
        topPanel.add(lab15);
        topPanel.add(text15);
        topPanel.add(lab16);
        topPanel.add(text16);
        topPanel.add(lab17);
        topPanel.add(text17);
        topPanel.add(lab18);
        topPanel.add(text18);
        topPanel.add(lab19);
        topPanel.add(text19);
        add(topPanel,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnCancel);
        btnCancel.addActionListener(controller);
        btnUpdate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str1=text1.getText();
                String str2=text2.getText();
                String str5=text5.getText();
                String str6=text6.getText();
                String str7=text7.getText();
                String str8=text8.getText();
                String str9=text9.getText();
                String str10=text10.getText();
                String str11=text11.getText();
                String str12=text12.getText();
                String str13=text13.getText();
                String str14=text14.getText();
                String str15=text15.getText();
                String str16=text16.getText();
                String str17=text17.getText();
                String str18=text18.getText();
                String str19=text19.getText();
                if(!str1.equals("") && !str2.equals("") &&
                        !str5.equals("") && !str6.equals("") &&
                        !str7.equals("")&& !str8.equals("")&&
                        !str9.equals("") && !str10.equals("") &&
                        !str11.equals("") && !str12.equals("") &&
                        !str13.equals("") && !str14.equals("") &&
                        !str15.equals("") && !str16.equals("") &&
                        !str17.equals("") && !str18.equals("") && !str19.equals("")){
                    if(isValid(str7) && isValid(str11) && isValid(str15) && isValid(str18) && isValid(str19)){
                        Book b=new Book();
                        b.Title=str5;
                        b.authorName=str6;
                        b.edition=Integer.parseInt(str7);
                        b.publisher=str8;
                        b.publishDate=str9;
                        b.publisherNumber=str10;
                        b.price=Integer.parseInt(str11);
                        b.authorNumber=str12;
                        b.companyName=str13;
                        b.id=str14;
                        b.pages=Integer.parseInt(str15);
                        b.mainArticle=str16;
                        b.approvedBy=str17;
                        b.articles=Integer.parseInt(str18);
                        b.copies=Integer.parseInt(str19);
                        text1.setText("");
                        text2.setText("");
                        text5.setText("");
                        text6.setText("");
                        text7.setText("");
                        text8.setText("");
                        text9.setText("");
                        text10.setText("");
                        text11.setText("");
                        text12.setText("");
                        text13.setText("");
                        text14.setText("");
                        text15.setText("");
                        text16.setText("");
                        text17.setText("");
                        text18.setText("");
                        text19.setText("");
                    if(!controller.object1.Edit(str1,str2,b)){
                            JOptionPane.showMessageDialog(topPanel,"No Data Found");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(topPanel,"Invalid Input");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(topPanel,"Please Fill Out Every Field!\nAll Fields Are Required");
                }
            }
        });
        add(buttonPanel, BorderLayout.SOUTH);
    }
    public boolean isValid(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'9' || str.charAt(i)<'0')return false;
        }
        return true;
    }            
}
