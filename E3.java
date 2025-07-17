
package vatsal;
import javax.swing.*;

public class E3 {
    
    public static void main(String a[]){
    
        JFrame f = new JFrame("E3");
        
        
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);
        
        JMenu m = new JMenu("File");
        mb.add(m);
        
        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        
        m.add(mi1);
        m.add(mi2);
        
       
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        
    }
    
}
