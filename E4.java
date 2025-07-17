package vatsal;
import javax.swing.*;
import java.awt.*;

public class E4 {
    public static void main(String a[]){
        
        JFrame f = new JFrame("E4");
        
        BorderLayout BL = new BorderLayout();
        f.setLayout(BL);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.red);
        f.add(p1,BorderLayout.NORTH);
        
        JPanel p2= new JPanel();
        p2.setBackground(Color.blue);
        f.add(p2,BorderLayout.SOUTH);
        
        JPanel p3= new JPanel();
        p3.setBackground(Color.green);
        f.add(p3,BorderLayout.EAST);
        
        JPanel p4= new JPanel();
        p4.setBackground(Color.black);
        f.add(p4,BorderLayout.WEST);

        
        JPanel p5= new JPanel();
        p5.setBackground(Color.orange);
        f.add(p5,BorderLayout.CENTER);
        
        f.setSize(1000,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
