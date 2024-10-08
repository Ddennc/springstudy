package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//            Department dep = new Department("Sales", 300,1120);
//            Employee emp1 = new Employee("Denys","Dudka",700);
//            Employee emp2 = new Employee("Kiril","Shul",500);
//            Employee emp3 = new Employee("Dima","Dim",800);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//  ***************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
Department department = session.get(Department.class,6);
System.out.println(department);
System.out.println(department.getEmps());
            session.getTransaction().commit();
            session = factory.getCurrentSession();
//***************************************************
//            session.beginTransaction();
//           Employee employee = session.get(Employee.class,1);
//            Employee employee1 = session.get(Employee.class,2);
//            System.out.println(employee);
//            System.out.println(employee1);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//              ***************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,2);
//            session.delete(employee);
       
            
//            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}