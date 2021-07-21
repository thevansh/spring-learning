package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal1=context.getBean("theLion",Animal.class);
        Animal animal2=context.getBean("theLion",Animal.class);
        animal1.makeSound();
        animal1.getNumberOfLegs();
        if(animal1==animal2)
            System.out.println("Same object");
    }
}
