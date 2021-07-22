package com.springdemo.annotation;

import org.springframework.beans.factory.annotation.Value;

public class TableSet implements Furniture{
    private Material type;
    @Value("${weight}")
    private int weightOfTableSet;

    public TableSet(Material type) {
        this.type = type;
    }

    @Override
    public void getTypeOfFurniture() {
        System.out.println("Weight of table set "+weightOfTableSet+" kg.");
        System.out.println("Here is your Table Set");
    }

    @Override
    public void typeOfMaterialUsed() {
            type.getTypeOfMaterial();
    }
}
