
package vatsal;
import java.sql.*;



public class P5 {
        public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/P5","root","");
            Statement s = c.createStatement();
            s.executeUpdate("insert into sturec values(95,'Naitik','Surat',1234567890,'naitik@gamail.com')");
            s.executeUpdate("insert into sturec values(96,'Vatsal','Surat',1234567890,'vatsal@gamail.com')");
            s.executeUpdate("insert into sturec values(97,'Darshan','Surat',1234567890,'darshan@gamail.com')");
            s.executeUpdate("update sturec set  Name='shahaj' where Name='Darshan'");
            s.executeUpdate("delete from sturec where Enroll = '96'");
      
            s.close();
            c.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }       
    } 
    
}
