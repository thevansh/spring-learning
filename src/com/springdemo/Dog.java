package com.springdemo;

public class Dog implements Animal{
    private  Legs legs;

    public Dog(Legs legs) {
        this.legs = legs;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes BOW sound");
    }
    @Override
    public void getNumberOfLegs(){
        legs.getNumberOfLegs();
    }
}
