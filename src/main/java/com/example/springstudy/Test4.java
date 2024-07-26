package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex2.xml");
        Dog MyDog = context.getBean("myPet", Dog.class);
//        MyDog.setName("Dog1");
        Dog YourDog = context.getBean("myPet", Dog.class);
//        YourDog.setName("Dog2");
//        System.out.println(MyDog.getName());
//        System.out.println(YourDog.getName());
        System.out.println("First dog"+MyDog);
        System.out.println("Second dog"+YourDog);
        
    }
}
