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

public class DeleteView extends JPanel {

    private final JLabel lab1=new JLabel("Title");
    private final JLabel lab2=new JLabel("Author Name");
    private final JTextField text1=new JTextField();
    private final JTextField text2=new JTextField();
    private final JButton btnDelete=new JButton("Delete");
    private final JButton btnCancel=new JButton("Cancel Delete");

    public DeleteView(GUI controller) {
        super(new BorderLayout());
        JPanel topPanel=new JPanel(new GridLayout(2,2));
        topPanel.add(lab1);
        topPanel.add(text1);
        topPanel.add(lab2);
        topPanel.add(text2);
        add(topPanel,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnCancel);
        btnCancel.addActionListener(controller);
        btnDelete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str1=text1.getText();
                String str2=text2.getText();
                if(!str1.equals("") && !str2.equals("")){
                    if(!controller.object1.Delete(str1,str2)){
                        JOptionPane.showMessageDialog(topPanel,"No Data Found");
                    }
                    text1.setText("");
                    text2.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(topPanel,"Please Fill Out Every Field!\nAll Fields Are Required");
                }
            }
        });
        add(buttonPanel, BorderLayout.SOUTH);
    }     
}
