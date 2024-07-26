package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex3.xml ");
        Dog Mydog = context.getBean("dog", Dog.class);
        Dog Yourdog = context.getBean("dog", Dog.class);
        System.out.println(Mydog);
        System.out.println(Yourdog);
        context.close();
        
         
    }
    
    
}
