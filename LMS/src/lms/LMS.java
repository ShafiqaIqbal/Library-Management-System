
package lms;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
        GUI controller=new GUI();
        
                controller.setTitle("Library Management System");
                controller.pack();
                controller.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                controller.setLocation(100, 100);
                controller.setVisible(true);
        // TODO code application logic here
    }
            });
    }
}
