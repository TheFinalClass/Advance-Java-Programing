package vatsal;
import javax.swing.*;
import java.awt.event.*;

public class E2 implements ActionListener{
   JButton B;
    
    public E2(){
        
        JFrame f = new JFrame("E2");
        
        B = new JButton("Start");
        B.setBounds(425,125,100,30);
    
        f.add(B);
        B.addActionListener(this);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        
    }
   
    
    public static void main(String[] args) {
        
        E2 e = new E2();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (B.getText()== "Start"){
            B.setText("Stop");
        }
        else if (B.getText()== "Stop"){
            B.setText("Start");
        }
    }
    
    


}
