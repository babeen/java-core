
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class NewFlowLayout extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;
    public NewFlowLayout(){
        setTitle("Border Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        btn1 = new JButton("Button 1");
        btn2 =  new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);
    
    setSize(500,300);
    setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NewFlowLayout();
    }
    
}
