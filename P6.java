
package vatsal;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class P6 {
    
    public static void main(String a[]){
    
        Configuration cf=new Configuration();
        cf.configure("hibernate.cfg.xml");
        
        SessionFactory s=cf.buildSessionFactory();
        
        Session se= s.openSession();
        se.beginTransaction();
        
//        Employee e1= new Employee();
//        e1.setName("vatsal");
//        e1.setAge(17);
//        e1.setSalary(5000);
//        e1.setDepartment("IT");
//        se.save(e1);
//        
//        Employee e2 = (Employee) se.get(Employee.class, 1);
//        e2.setName("darshan");
//        se.update(e2);
//        
//        Employee e3 = (Employee) se.get(Employee.class, 6);
//        se.delete(e3);
        
        Employee e4 = (Employee) se.get(Employee.class, 2);
        System.out.println(e4.getId());
        System.out.println(e4.getName());
        
        se.getTransaction().commit();
        se.close();
    }
    
}
