package lms;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SearchView extends JPanel {

    private final JLabel lab1=new JLabel("Title : ");
    private final JLabel lab2=new JLabel("Author Name : ");
    private final JLabel lab3=new JLabel("Edition : ");
    private final JLabel lab4=new JLabel("Publisher : ");
    private final JLabel lab5=new JLabel("Publish Date :");
    private final JLabel lab6=new JLabel("Publisher Number : ");
    private final JLabel lab7=new JLabel("Price : ");
    private final JLabel lab8=new JLabel("Author Number : ");
    private final JLabel lab9=new JLabel("Company Name : ");
    private final JLabel lab10=new JLabel("Id :");
    private final JLabel lab11=new JLabel("Pages : ");
    private final JLabel lab12=new JLabel("Main Article : ");
    private final JLabel lab13=new JLabel("Approved By : ");
    private final JLabel lab14=new JLabel("Articles : ");
    private final JLabel lab15=new JLabel("Copies :");
    private final JTextField text1=new JTextField();
    private final JButton btnSearch=new JButton("Search");
    private final JButton btnExit=new JButton("Exit Search");
    private final JButton btnPrevious=new JButton("Previous");
    private final JButton btnNext=new JButton("Next");
    private JPanel buttonPanel,topPanel;
    private ArrayList<Book> list;
    private Book book;
    public SearchView(GUI controller) {
        super(new BorderLayout());
        topPanel = new JPanel(new GridLayout(15,1));
        topPanel.add(lab1);
        topPanel.add(lab2);
        topPanel.add(lab3);
        topPanel.add(lab4);
        topPanel.add(lab5);
        topPanel.add(lab6);
        topPanel.add(lab7);
        topPanel.add(lab8);
        topPanel.add(lab9);
        topPanel.add(lab10);
        topPanel.add(lab11);
        topPanel.add(lab12);
        topPanel.add(lab13);
        topPanel.add(lab14);
        topPanel.add(lab15);
        add(topPanel,BorderLayout.CENTER);
        buttonPanel = new JPanel(new GridLayout(1,5));
        buttonPanel.add(text1);
        buttonPanel.add(btnSearch);
        buttonPanel.add(btnPrevious);
        buttonPanel.add(btnNext);
        btnPrevious.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                book=controller.object1.Navigate(book, false,list);
        lab1.setText("Title : "+book.Title);
        lab2.setText("Author Name : "+book.authorName);
        lab3.setText("Edition : "+book.edition);
        lab4.setText("Publisher : "+book.publisher);
        lab5.setText("Publish Date : "+book.publishDate);
        lab6.setText("Publisher Number : "+book.publisherNumber);
        lab7.setText("Price : "+book.price);
        lab8.setText("Author Number : "+book.authorNumber);
        lab9.setText("Company Name : "+book.companyName);
        lab10.setText("Id : "+book.id);
        lab11.setText("Pages : "+book.pages);
        lab12.setText("Main Article : "+book.mainArticle);
        lab13.setText("Approved By : "+book.approvedBy);
        lab14.setText("Articles : "+book.articles);
        lab15.setText("Copies : "+book.copies);
            }
        });
        btnNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                book=controller.object1.Navigate(book, true,list);
        lab1.setText("Title : "+book.Title);
        lab2.setText("Author Name : "+book.authorName);
        lab3.setText("Edition : "+book.edition);
        lab4.setText("Publisher : "+book.publisher);
        lab5.setText("Publish Date : "+book.publishDate);
        lab6.setText("Publisher Number : "+book.publisherNumber);
        lab7.setText("Price : "+book.price);
        lab8.setText("Author Number : "+book.authorNumber);
        lab9.setText("Company Name : "+book.companyName);
        lab10.setText("Id : "+book.id);
        lab11.setText("Pages : "+book.pages);
        lab12.setText("Main Article : "+book.mainArticle);
        lab13.setText("Approved By : "+book.approvedBy);
        lab14.setText("Articles : "+book.articles);
        lab15.setText("Copies : "+book.copies);
            }
        });
        btnSearch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str1=text1.getText();
                if(!str1.equals("")){
                    list=controller.object1.Search(str1);
                    if(list.size()>0){
                        book=list.get(0);
        lab1.setText("Title : "+book.Title);
        lab2.setText("Author Name : "+book.authorName);
        lab3.setText("Edition : "+book.edition);
        lab4.setText("Publisher : "+book.publisher);
        lab5.setText("Publish Date : "+book.publishDate);
        lab6.setText("Publisher Number : "+book.publisherNumber);
        lab7.setText("Price : "+book.price);
        lab8.setText("Author Number : "+book.authorNumber);
        lab9.setText("Company Name : "+book.companyName);
        lab10.setText("Id : "+book.id);
        lab11.setText("Pages : "+book.pages);
        lab12.setText("Main Article : "+book.mainArticle);
        lab13.setText("Approved By : "+book.approvedBy);
        lab14.setText("Articles : "+book.articles);
        lab15.setText("Copies : "+book.copies);
                    }
                    else{
        lab1.setText("Title : ");
        lab2.setText("Author Name : ");
        lab3.setText("Edition : ");
        lab4.setText("Publisher : ");
        lab5.setText("Publish Date : ");
        lab6.setText("Publisher Number : ");
        lab7.setText("Price : ");
        lab8.setText("Author Number : ");
        lab9.setText("Company Name : ");
        lab10.setText("Id : ");
        lab11.setText("Pages : ");
        lab12.setText("Main Article : ");
        lab13.setText("Approved By : ");
        lab14.setText("Articles : ");
        lab15.setText("Copies : ");
                        JOptionPane.showMessageDialog(topPanel,"No Data Found");
                    }
                    text1.setText("");
                }
                else{
        lab1.setText("Title : ");
        lab2.setText("Author Name : ");
        lab3.setText("Edition : ");
        lab4.setText("Publisher : ");
        lab5.setText("Publish Date : ");
        lab6.setText("Publisher Number : ");
        lab7.setText("Price : ");
        lab8.setText("Author Number : ");
        lab9.setText("Company Name : ");
        lab10.setText("Id : ");
        lab11.setText("Pages : ");
        lab12.setText("Main Article : ");
        lab13.setText("Approved By : ");
        lab14.setText("Articles : ");
        lab15.setText("Copies : ");
                }
            }
        });
        buttonPanel.add(btnExit);
        btnExit.addActionListener(controller);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
