package vatsal;
import java.sql.*;

public class E6 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
            Statement s = c.createStatement();
           
            s.executeUpdate("CREATE DATABASE Demo");
            System.out.println("Database Demo created successfully");
            s.close();
            c.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
