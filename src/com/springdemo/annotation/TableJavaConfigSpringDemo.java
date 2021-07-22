package com.springdemo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TableJavaConfigSpringDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(FurnitureConfig.class);
        Furniture type1=context.getBean("tableSet",Furniture.class);
        type1.getTypeOfFurniture();
        type1.typeOfMaterialUsed();
        context.close();
    }
}
