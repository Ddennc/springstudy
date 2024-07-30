package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University  {
    
    private List<Student> students = new ArrayList<>();
    public void addStudent(){
       Student st1 =  new Student("Denys Dudka",8.4,4);
        Student st2=  new Student("Dima Arm",6.7,2);
        Student st3 =  new Student("Kiril Shulyak",5.6,3);
       students.add(st1);
        students.add(st2);
        students.add(st3);
        
    }
    public List<Student> getStudents(){
        System.out.println("Start of method getStudents");
//        System.out.println(students.get(3));
        System.out.println("Info from method getStudents:");
        System.out.println(students);
        return students;
        
    }
}
 