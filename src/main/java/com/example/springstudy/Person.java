package com.example.springstudy;

import com.sun.tools.attach.AgentInitializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean") 
public class Person {
//  
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
//@Autowired
//    public Person(@Qualifier("dog")Pet pet) {
//        System.out.println("Person been is created");
//        this.pet = pet;
//    }
    
 
    public Person() {
        System.out.println("Person been is created");

    }

    public Person(Pet pet) {
        System.out.println("Person been is created");
//        this.pet = pet;
    }

    //    @Autowired
//    @Qualifier("dog") 
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
    System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callyourpet(){
        System.out.println("Hello my pet!");
        pet.say();
    }
}

