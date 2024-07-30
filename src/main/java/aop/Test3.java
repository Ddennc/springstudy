package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Main started");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
      UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
      String bookName =  uniLibrary.returnBook();
System.out.println("Returned book to the library : "+bookName);
        System.out.println("Main finished");
        context.close();
    }
}
