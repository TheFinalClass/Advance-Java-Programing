
package darshan;

import java.sql.*;



public class P5 {
        public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/P4","root","");
            Statement s = c.createStatement();
            s.executeUpdate("insert into student values(96,'Vatsal','Surat',1234567890,'vatsal@gamail.com')");
            s.executeUpdate("insert into student values(97,'Darshan','AA',1234567890,'darshan@gamail.com')");
            s.executeUpdate("update student set  Name='shahaj' where Name='Vatsal'");
            s.executeUpdate("delete from student where Enroll = '96'");
      
        } catch (Exception e) {
            System.out.println(e);
        }       
    } 
    
}
