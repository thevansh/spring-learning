package com.springdemo.annotation;

import org.springframework.stereotype.Component;

@Component
public class Wood implements Material{
    @Override
    public void getTypeOfMaterial() {
        System.out.println("Wood");;
    }
}
