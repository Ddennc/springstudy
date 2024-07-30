package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    
    @Around("execution(public String returnBook())")
    public Object aroundGetBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundGetBookAdvice : a book is going to be returned to the library");
        Object targetMethodResult = null;
        try {

            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundGetBookAdvice : exception was caught"+e);
            targetMethodResult = "Unknown";
        }
        System.out.println("aroundGetBookAdvice : a book is returned to the library");
        return targetMethodResult;
    }
}
