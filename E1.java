package vatsal;
import javax.swing.*;
import java.awt.*;

public class E1 extends JApplet{
    
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.blue);
        g.fillOval(125, 50, 100, 100);
        g.setColor(Color.white);
        g.drawString("vatsal", 159, 104);
    }
    
}