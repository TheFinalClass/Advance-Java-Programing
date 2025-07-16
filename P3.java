package vatsal;
import javax.swing.*;
import java.awt.event.*;

public class P3 implements ItemListener{
   JRadioButton R1,R2,R3;
   JLabel L2;
    
    public P3(){
        
        JFrame f = new JFrame("P3");
        
        JLabel L1 = new JLabel("Traffic Signal:");
        L1.setBounds(20,20,100,30);
        
        R1 = new JRadioButton("Red");
        R1.setBounds(125,25,150,20);
        
        R2 = new JRadioButton("Green");
        R2.setBounds(125,45,150,20);
        
        R3 = new JRadioButton("Yellow");
        R3.setBounds(125,65,150,20);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(R1);
        bg.add(R2);
        bg.add(R3);
        
        L2 = new JLabel();
        L2.setBounds(135,90,150,20);
        

               
        f.add(L1);
        f.add(R1);
        f.add(R2);
        f.add(R3);
        R1.addItemListener(this);
        R2.addItemListener(this);
        R3.addItemListener(this);
        f.add(L2);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
    }
   
    
    public static void main(String[] args) {
        
        P3 p3 = new P3();
        
    }
    
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if (R1.isSelected()){
            L2.setText("Stop");
        }
        else if (R2.isSelected()){
            L2.setText("go");
        }
        else if (R3.isSelected()){
            L2.setText("wait");
        }
    }
}
