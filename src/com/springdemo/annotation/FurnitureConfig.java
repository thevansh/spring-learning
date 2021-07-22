package com.springdemo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@ComponentScan("com.springdemo.annotation")
public class FurnitureConfig {
    @Bean
    public Material typeOfMaterial(){
        return new Plastic();
    }

    @Bean
    public Furniture tableSet(){
        return new TableSet(typeOfMaterial());
    }
}
