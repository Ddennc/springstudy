package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                addAnnotatedClass(Detail.class).
                buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//         Employee employee = new Employee("Den","Dud", "Sales", 2266);
//         Detail detail = new Detail("Prague","+420000000000","dend@gmail.com");
//         employee.setEmpDetail(detail);
//            session.beginTransaction();
//         session.save(employee);
//            session.getTransaction().commit();
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Di","Di", "Sales", 2466);
//            Detail detail = new Detail("Prague","+420006000000","didi@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//         session = factory.getCurrentSession();
//         session.beginTransaction();
//Employee employee = session.get(Employee.class,1);
//System.out.println(employee.getEmpDetail());
//            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class,2 );
            session.delete(employee);
           
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}