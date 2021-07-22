package com.springdemo.annotation;

import org.springframework.stereotype.Component;

@Component
public class Plastic implements Material{
    @Override
    public void getTypeOfMaterial() {
        System.out.println("Plastic");

    }
}
