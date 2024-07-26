package com.example.springstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:myApp.properties")
@org.springframework.context.annotation.Configuration
//@ComponentScan("com.example.springstudy ")
public class Configuration {
    @Bean
    public Pet catBean(){
        return new Cat();
    }
 
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
