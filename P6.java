package vatsal;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class P6 {

    public static void main(String a[]) {

        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");

        SessionFactory sf = cf.buildSessionFactory();

        // ---------------- STORE ----------------
        Session s1 = sf.openSession();
        s1.beginTransaction();

        Employee e1 = new Employee();
        e1.setName("Vatsal");
        e1.setAge(22);
        e1.setSalary(25000);
        e1.setDepartment("IT");

        s1.save(e1);

        s1.getTransaction().commit();
        s1.close();
        System.out.println("Employee Stored Successfully!");

        // ---------------- UPDATE ----------------
        Session s2 = sf.openSession();
        s2.beginTransaction();

        Employee e2 = (Employee) s2.get(Employee.class, 1); // change ID as per DB
        if (e2 != null) {
            e2.setName("Darshan");
            e2.setSalary(30000);
            s2.update(e2);
            System.out.println("Employee Updated Successfully!");
        }

        s2.getTransaction().commit();
        s2.close();

        // ---------------- DELETE ----------------
        Session s3 = sf.openSession();
        s3.beginTransaction();

        Employee e3 = (Employee) s3.get(Employee.class, 2); // change ID as per DB
        if (e3 != null) {
            s3.delete(e3);
            System.out.println("Employee Deleted Successfully!");
        }

        s3.getTransaction().commit();
        s3.close();

        // ---------------- FETCH ----------------
        Session s4 = sf.openSession();
        s4.beginTransaction();

        Employee e4 = (Employee) s4.get(Employee.class, 1); // change ID as per DB
        if (e4 != null) {
            System.out.println("ID: " + e4.getId());
            System.out.println("Name: " + e4.getName());
            System.out.println("Age: " + e4.getAge());
            System.out.println("Salary: " + e4.getSalary());
            System.out.println("Department: " + e4.getDepartment());
        }

        s4.getTransaction().commit();
        s4.close();

        sf.close();
    }
}
