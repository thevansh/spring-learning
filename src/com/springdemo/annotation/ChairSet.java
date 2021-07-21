package com.springdemo.annotation;

import org.springframework.stereotype.Component;

@Component
public class ChairSet implements Furniture{
    @Override
    public void getTypeOfFurniture() {
        System.out.println("Here is your Chair Set");
    }
}

