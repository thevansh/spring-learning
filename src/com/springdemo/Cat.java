package com.springdemo;

public class Cat implements Animal{
    private  Legs legs;
    public Cat(Legs legs) {
        this.legs=legs;
    }

    @Override
    public void makeSound() {
        legs.getNumberOfLegs();
    }
    @Override
    public void getNumberOfLegs(){
        legs.getNumberOfLegs();
    }
}
