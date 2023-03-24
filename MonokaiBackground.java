package monokaibackground;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class MonokaiBackground extends JFrame {
    public MonokaiBackground(){
    setTitle("Monokai Background Example");
    setSize(400,400);
    JPanel panel = new JPanel();
    panel.setBackground(new Color(39,40,34));
    add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MonokaiBackground();
    }
    
}
