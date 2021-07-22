package com.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Furniture type1=context.getBean("chairSet",Furniture.class);
        Furniture type2=context.getBean("chairSet",Furniture.class);
        if(type1==type2)
            System.out.println("singleton");
        else
            System.out.println("Prototype");
        context.close();
    }
}
