
package lms;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener{
private static final long serialVersionUID = 1L;
    private tableView t1;
    private ArrayList<Book> list;
    public ListBook object1;
    public final MainView mainView;
    public final AddView addView;
    public final NavigateView navigateView;
    public final SearchView searchView;
    public final DeleteView deleteView;
    public final UpdateView updateView;
    public GUI(){
        object1=new ListBook();
        list=object1.getList();
        t1=new tableView(list);
        mainView=new MainView(this);
        addView=new AddView(this);
        navigateView=new NavigateView(this);
        searchView=new SearchView(this);
        deleteView=new DeleteView(this);
        updateView=new UpdateView(this);
        add(mainView,BorderLayout.CENTER);
    }
    public tableView getTableView(){
        list=object1.getList();
        t1=new tableView(list);
        return t1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Add")){
            remove(mainView);
            add(addView,BorderLayout.CENTER);
        }
        else if(command.equals("Update")){
            remove(mainView);
            add(updateView,BorderLayout.CENTER);
        }
        else if(command.equals("Delete")){
            remove(mainView);
            add(deleteView,BorderLayout.CENTER);
        }
        else if(command.equals("Search")){
            remove(mainView);
            add(searchView,BorderLayout.CENTER);
        }
        else if(command.equals("Navigate")){
            remove(mainView);
            add(navigateView,BorderLayout.CENTER);
        }
        else if(command.equals("Cancel")){
            remove(addView);
            add(mainView,BorderLayout.CENTER);
        }
        else if(command.equals("Exit Navigation")){
            remove(navigateView);
            add(mainView,BorderLayout.CENTER);
        }
        else if(command.equals("Exit Search")){
            remove(searchView);
            add(mainView,BorderLayout.CENTER);
        }
        else if(command.equals("Cancel Update")){
            remove(updateView);
            add(mainView,BorderLayout.CENTER);
        }
        else if(command.equals("Cancel Delete")){
            remove(deleteView);
            add(mainView,BorderLayout.CENTER);
        }
        else if(command.equals("Exit")){
            dispose();
        }
        validate();
        repaint();
    }
}
