
package vatsal;
import java.sql.*;

public class P4  {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/P4","root","");
            Statement s = c.createStatement();
            ResultSet rs= s.executeQuery("select * from sturec");
            System.out.println("Enroll | Name | Address | Mobile No | Email Id");
            while(rs.next()){
                System.out.println(rs.getInt("Enroll")+ " | " +rs.getString("Name")+ " | " +rs.getString("Address")+ " | " +rs.getString("MobileNo")+ " | " +rs.getString("EmailId"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }       
    }     
}
