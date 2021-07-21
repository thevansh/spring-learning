package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");

        Animal animal1=context.getBean("theLion",Animal.class);
        animal1.makeSound();
        animal1.getNumberOfLegs();
        context.close();

    }
}
