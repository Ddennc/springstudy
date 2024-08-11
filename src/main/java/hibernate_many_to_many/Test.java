package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Child.class).
                addAnnotatedClass(Section.class).
                buildSessionFactory();
        Session session = null;
        try{
//            session = factory.getCurrentSession();
//            Child child1 = new Child("Erik",10);
//            Child child2 = new Child("Max",12);
//            Child child3 = new Child("Masha",11);
//            Section section = new Section("Football");
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//            session.beginTransaction();
//            session.save(section);
//            session.getTransaction().commit();
//            *****************************************
//            session = factory.getCurrentSession();
//            Child child1 = new Child("Kamil",10);
//            Section section1 = new Section("Football");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Dance");
//           child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            *****************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//           Section section = session.get(Section.class,1);
//           System.out.println(section);
//            System.out.println(section.getChildren());
//          
//           
//            session.getTransaction().commit();
//            *****************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class,4);
//            System.out.println(child);
//            System.out.println(child.getSections());
            //            *****************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class,1);
//            session.delete(section);
//
//            session.getTransaction().commit();
            //            *****************************************
//            session = factory.getCurrentSession();
//            Child child1 = new Child("Erik",10);
//            Child child2 = new Child("Max",12);
//            Child child3 = new Child("Masha",11);
//            Section section = new Section("Football");
//           
//            session.beginTransaction();
//            session.save(section);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);
//            session.getTransaction().commit();
            //            *****************************************
//            session = factory.getCurrentSession();
//            Child child1 = new Child("Edvin",10);
//            Section section1 = new Section("Wrestling");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Box");
//           child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.beginTransaction();
//            session.persist(child1);
//            session.getTransaction().commit();
            //            *****************************************
            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class,7);
            session.delete(child);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
            
        }
        
    
    
    
    }
}
