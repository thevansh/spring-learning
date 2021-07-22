package com.springdemo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChairSet implements Furniture{
    private Material material;

    /*
    //Here autowired annotation is optional
    @Autowired
    public ChairSet(Material material) {
        this.material = material;
    }
    */
    @Autowired
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void getTypeOfFurniture() {
        System.out.println("Here is your Chair Set");
    }

    @Override
    public void typeOfMaterialUsed(){
        material.getTypeOfMaterial();
    }
}

