package aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {
//    @Override 
    public void getBook(){
        System.out.println("WE took the book from UniLibrary ");
        System.out.println("---------------------------------");
    }
    public void getMagazine(){
        System.out.println("WE took the magazine from UniLibrary");
        System.out.println("---------------------------------");
    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("WE return the book from UniLibrary");
        return "Prestige";
    }
    public void returnMagazine(){
        System.out.println("WE return the magazine from UniLibrary");
        System.out.println("---------------------------------");
    }
    public void addBook(String person_name, Book book ){
        System.out.println("WE add the book  from UniLibrary");
        System.out.println("---------------------------------");
    }
    public void addMagazine(){
        System.out.println("WE add the magazine from UniLibrary");
        System.out.println("---------------------------------");
    }
}
