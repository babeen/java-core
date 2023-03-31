
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


class GridLayoutTIC extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;
    public GridLayoutTIC(){
        setTitle("Border Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new GridLayout(2,3));
        setLayout(null);
        btn1 = new JButton("Button 1");
        
        btn2 =  new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        
        btn1.setBounds(50,50,100,25);//left,top,width,height
        btn2.setBounds(150,80,100,25);
        btn3.setBounds(350,140,100,25);
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
        new GridLayoutTIC();
    } 
}
