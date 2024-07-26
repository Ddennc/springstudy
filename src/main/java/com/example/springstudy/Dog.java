package com.example.springstudy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void init(){
        System.out.println("Init create");
        
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy create");

    }

    public Dog() {
        System.out.println("Dog been is created");
    }

    @Override
    public  void say(){
      
        System.out.println("Bow-wow");
        
    }
}
