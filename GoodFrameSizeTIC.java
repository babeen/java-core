package goodframesizetic;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Babeen
 */
public class GoodFrameSizeTIC extends JFrame {
    
    public GoodFrameSizeTIC(){
        setTitle("Good Frame Size");
        
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);
//        setSize(300,300);

        Image img = new ImageIcon("image/myfavicon.jpg").getImage();
        setIconImage(img);
        
        setLocationRelativeTo(null);// aligns to center
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            new GoodFrameSizeTIC();
    }
    
}
