package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotations  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex3.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callyourpet();  
        System.out.println(person.getSurname());
        System.out.println(person.getAge()  );
//        Cat MyCat = context.getBean("catBean",Cat.class );
//        MyCat.say();
         context.close(); 
    }
}
