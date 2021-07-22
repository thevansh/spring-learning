package com.springdemo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSpringDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(FurnitureConfig.class);
        Furniture type1=context.getBean("chairSet",Furniture.class);
        type1.getTypeOfFurniture();
        context.close();
    }
}
