package com.example.springstudy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
         Person person = context.getBean("personBean", Person.class);
//person.callyourpet();
//        Pet cat = context.getBean("catBean",Pet.class);
//        cat.say(); 
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        context.close();
        
    }
}
