package vatsal;
import javax.swing.*;
import java.awt.event.*;

public class P2 implements ItemListener{
    
    JCheckBox C1,C2,C3,C4,C5;
    JLabel L2;
    
    
    public P2(){
        
        JFrame f = new JFrame("P2");
        
        JLabel L1 = new JLabel("Select Course:");
        L1.setBounds(20,20,100,30);
        
        C1 = new JCheckBox("Information Technology");
        C1.setBounds(125,25,150,20);
        
        C2 = new JCheckBox("Computer");
        C2.setBounds(125,45,150,20);
        
        C3 = new JCheckBox("Mechanical");
        C3.setBounds(125,65,150,20);
        
        C4 = new JCheckBox("Automobile");
        C4.setBounds(125,85,150,20);
        
        C5 = new JCheckBox("Chemical");
        C5.setBounds(125,105,150,20);
       
        
        L2 = new JLabel();
        L2.setBounds(125,135,500,20);
          
        f.add(L1);
        f.add(C1);
        f.add(C2);
        f.add(C3);
        f.add(C4);
        f.add(C5);
        f.add(L2);
        C1.addItemListener(this);
        C2.addItemListener(this);
        C3.addItemListener(this);
        C4.addItemListener(this);
        C5.addItemListener(this);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
    }
   
    
    public static void main(String[] args) {
        
        P2 p2 = new P2();
        
    }
    
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        String s = " ";
        
        if(C1.isSelected()){
            s=s+C1.getText()+" , ";
            
        }
        
        if(C2.isSelected()){
            s=s+C2.getText()+" , ";
        }
        
        if(C3.isSelected()){
            s=s+C3.getText()+" , ";
        }
        
        if(C4.isSelected()){
            s=s+C4.getText()+" , ";
        }
        
        if(C5.isSelected()){
            s=s+C5.getText()+".";
        }
        L2.setText(s);
    }
}
