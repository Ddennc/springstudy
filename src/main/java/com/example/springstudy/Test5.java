package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.ldap.Control;

public class Test5 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
//dog.destroy();
        context.close();
    }
}
