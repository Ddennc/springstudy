package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        
        context.close();
        
    }
}
