package borderlayouttic;

import java.awt.BorderLayout;
import javax.swing.*;

public class BorderLayoutTIC extends JFrame {
    JButton btn1, btn2, btn3, btn4,btn5;
    
    public BorderLayoutTIC(){
        setTitle("Border Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(20,20));
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5);
        setSize(500,300);
        setVisible(true);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new BorderLayoutTIC();
    }
}
