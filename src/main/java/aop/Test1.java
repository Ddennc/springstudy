package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);
        unilibrary.addBook("Denys",book);
        unilibrary.addMagazine();    
//         
//        unilibrary.getBook();
//        unilibrary.getMagazine();
//      unilibrary.returnMagazine();  
       
        
//        schoolLibrary.getBook();
//        unilibrary.returnBook();
    
        context.close();
    }
} 