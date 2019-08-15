package lms;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainView extends JPanel {

    private final JTable table;
    private final JButton btnAdd=new JButton("Add");
    private final JButton btnUpdate=new JButton("Update");
    private final JButton btnDelete=new JButton("Delete");
    private final JButton btnSearch=new JButton("Search");
    private final JButton btnNavigate=new JButton("Navigate");
    private final JButton btnExit=new JButton("Exit");

    public MainView(GUI controller) {
        super(new BorderLayout());
        table=new JTable(controller.getTableView());
        add(new JScrollPane(table));
        JPanel buttonPanel = new JPanel(new GridLayout(1,6));
        buttonPanel.add(btnAdd);
        btnAdd.addActionListener(controller);
        buttonPanel.add(btnUpdate);
        btnUpdate.addActionListener(controller);
        buttonPanel.add(btnDelete);
        btnDelete.addActionListener(controller);
        buttonPanel.add(btnSearch);
        btnSearch.addActionListener(controller);
        buttonPanel.add(btnNavigate);
        btnNavigate.addActionListener(controller);
        buttonPanel.add(btnExit);
        btnExit.addActionListener(controller);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    public JTable getTable(){
        return table;
    }
            
}
