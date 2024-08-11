package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                addAnnotatedClass(Department.class).
                buildSessionFactory();
        Session session = null;
        try {
//
//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 400,1320);
//            Employee emp1 = new Employee("Denysss","D",900);
//            Employee emp2 = new Employee("Kiril","Shul",500);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//  ***************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//Department department = session.get(Department.class,2);
//System.out.println(department);
//System.out.println(department.getEmps());
//            session.getTransaction().commit();
//            session = factory.getCurrentSession();
//***************************************************
//            session.beginTransaction();
//           Employee employee = session.get(Employee.class,1);
//            Employee employee1 = session.get(Employee.class,2);
//            System.out.println(employee);
//            System.out.println(employee1);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//              ***************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class,1);
            session.delete(department);


            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}