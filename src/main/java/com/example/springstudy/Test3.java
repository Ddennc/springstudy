package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
        
//        Pet pet = new Cat();
//        Person person = new Person(pet);создание с помощью конструктора хардово
        Person person = context.getBean("myPerson",Person.class);
        person.callyourpet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        
        context.close();
        
    }
}
