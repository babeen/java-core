package firstswing;

import javax.swing.JFrame;

/**
 *
 * @author Babeen
 */
public class FirstSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Advance Java Programming");
//        frame.setSize(300,300);
        frame.setBounds(300,250,300,300);
        frame.setResizable(false);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
