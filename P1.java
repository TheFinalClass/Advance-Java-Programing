package vatsal;
import javax.swing.*;

public class P1 {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("P1");
        
        JLabel L1 = new JLabel("Enter Username:");
        L1.setBounds(20,20,100,30);
        
        JTextField T1 = new JTextField();
        T1.setBounds(125,25,150,20);
        
        JButton B1 = new JButton("Submit");
        B1.setBounds(75,70,100,20);
//        
        f.add(L1);
        f.add(T1);
        f.add(B1);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
}
