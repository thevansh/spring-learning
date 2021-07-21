package com.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Furniture type=context.getBean("chairSet",Furniture.class);
        type.getTypeOfFurniture();
    }
}
