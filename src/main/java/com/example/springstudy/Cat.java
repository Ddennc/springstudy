package com.example.springstudy;

import org.springframework.stereotype.Component;

// 
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void say(){
        
        System.out.println("Meow-meow");
    }
}
