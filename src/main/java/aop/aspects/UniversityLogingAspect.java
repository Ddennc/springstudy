package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: log receiving the list of students before method getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname= "Mr."+nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//         double avrGrade = firstStudent.getAvgGrade();
//         avrGrade=avrGrade+1;
//         firstStudent.setAvgGrade(avrGrade);
//         
//        
//        System.out.println("afterReturningGetStudentsLoggingAdvice: log receiving the list of students after the  method getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice : log the exception of throw "+exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice : logging the normal completion of work or the throwing of an exception");
    }
}
