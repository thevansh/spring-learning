package com.springdemo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ChairSet implements Furniture{
    @Autowired
    @Qualifier("plastic")
    private Material material;

    @Value("${weight}")
    private int weight;
    /*
    //Here autowired annotation is optional
    @Autowired
    public ChairSet(@Qualifier("plastic") Material material) {
        this.material = material;
    }
    */


    /*
    @Autowired
    public void setMaterial(Material material) {
        this.material = material;
    }
    */

    @Override
    public void getTypeOfFurniture() {
        System.out.println(weight);
        System.out.println("Here is your Chair Set");
    }

    @Override
    public void typeOfMaterialUsed(){
        material.getTypeOfMaterial();
    }
}

