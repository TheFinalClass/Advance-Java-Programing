
package vatsal;
import javax.swing.*;
import java.awt.event.*;

public class E5 implements MouseListener,MouseMotionListener{
    
    JLabel l1,l2,l3,l4;
    
    E5(){
        
    JFrame f = new JFrame("E5");
        
        
        l1= new JLabel();
        l1.setBounds(125, 125, 150, 30);
        
        l2= new JLabel();
        l2.setBounds(125, 165, 150, 30);
        
        l3 = new JLabel("MouseListener:");
        l3.setBounds(125, 105, 150, 30);
        
        l4 = new JLabel("MouseMotionListener:");
        l4.setBounds(125, 145, 150, 30);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
    public static void main(String a[]){
        
        E5 e5 = new E5();
    
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {   
        l1.setText("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l2.setText("Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l2.setText("Moved");
    }
    
}
