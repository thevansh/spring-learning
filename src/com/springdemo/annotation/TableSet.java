package com.springdemo.annotation;

public class TableSet implements Furniture{
    private Material type;



    public TableSet(Material type) {
        this.type = type;
    }

    @Override
    public void getTypeOfFurniture() {
        System.out.println("Here is your Table Set");
    }

    @Override
    public void typeOfMaterialUsed() {
            type.getTypeOfMaterial();
    }
}
