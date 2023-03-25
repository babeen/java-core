package twodshapestic;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
class MyPanel extends JPanel
{
 public MyPanel(){
     setPreferredSize(new Dimension(600,500));
 }
 
 @Override
 
 /* Line starts to draw from the top left corner of the device*/
 public void paint(Graphics g){
     super.paint(g);
     
     // Draw a line
     Graphics2D g2d = (Graphics2D)g;
     g2d.setColor(Color.red);
     g2d.setStroke(new BasicStroke(4));
     g2d.drawLine(200,100,480,100);
     
     // Draw a string using Font
     Font font = new Font("monotype Corsiva", Font.BOLD,18);
     g2d.setFont(font);
     g2d.setColor(Color.blue);
     String message = "Welcome in JAVA 2D Graphics";
     
     g2d.drawString(message,220,80);
     
     // Draw Image
     
     Image img= new ImageIcon("image/cryptoGraphy.jpg").getImage();
     g2d.drawImage(img, 220, 110,250,180,null);
     
     g2d.setPaint(Color.red);
     g2d.drawString("Hello Java",280,180);
     
     // Draw Rectangle
     
     g2d.setColor(Color.red);
     g2d.drawRect(220, 110, 250, 180);
     
     
     //Draw Ellipse
     
     Ellipse2D oval = new Ellipse2D.Double(100,200,50,80);
     g2d.fill(oval);
     
     // Rectangle 2D
     
     Rectangle2D r = new Rectangle2D.Float(250,250,250,150);
     g2d.draw(r);
     
     // Draw a triangle using polygon
//     
//     int[]xPoints = 20,50,80;
//     int[]yPoints = [150,30,150];
//     g2d.drawPolygon(xPoints,yPoints,3);
     
     
     
     
 }

}
/**
 *
 * @author B@been
 */
public class TwoDShapesTIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("TwoD shapes Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        frame.add(new MyPanel());
        frame.pack();
        frame.setVisible(true);
    }
    
}
