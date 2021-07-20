package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal=context.getBean("theLion",Animal.class);
        animal.makeSound();
        animal.getNumberOfLegs();

    }
}
