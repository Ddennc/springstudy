package aop.aspects;

import aop.Book;
import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



import static org.springframework.cglib.core.ReflectUtils.getSignature;

@Component
@Aspect
@Order(1)
public class LogingAspect {
    
    

    
//   @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//       System.out.println("beforeGetLoggingAdvice : writing Log #1");
//   }
//   @Before("allReturnMethodsFromLibrary()")
//           public void  beforeReturnLoggingAdvice(){
//       System.out.println("beforeReturn LoggingAdvice : writing Log #2 ");
//    }
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    public void  beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturn LoggingAdvice : writing Log #3 ");
//        
//    }
//    @Before("allMethodsExceptReturn()")
//    public void beforeAllMethodsExceptReturn(){
//        System.out.println("beforeAllMethodsExceptReturn LoggingAdvice : writing Log #4 ");
//    }
        

//    @Before("execution(public void getBook(aop.Book ))")
//    public void beforeGetBookAdvice(){
//        System.out.println("Try to get the book ");
//    }

@Before("aop.aspects.MyPointcuts.allAddMethods()")
public void beforeAddBookLoggingAdvice(JoinPoint joinPoint){
//    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    System.out.println("methodSignature "+methodSignature);
    System.out.println("methodSignature "+methodSignature.getMethod());
    System.out.println("methodSignature "+methodSignature.getReturnType());
    System.out.println("methodSignature "+methodSignature.getName());
    System.out.println("beforeGetBookLoggingAdvice : Try to get the book/magazine");
    System.out.println("---------------------------------");
    if(methodSignature.getName().equals("addBook")){
        Object[] arguments = joinPoint.getArgs();
        for(Object object:arguments){
            if(object instanceof Book){
                Book myBook = (Book) object;
                System.out.println("Book info name-"+myBook.getName()+" aвтор- "+myBook.getAuthor()+" год издания- "+myBook.getYearOfPublication());
            }
            else if( object instanceof String){
                System.out.println("book to library add "+object);
            }
        }
        
        
    }
}
//    @Before("execution(public * return* ())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("Try to return the book ");
//    }
  
    
}
