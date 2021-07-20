package com.springdemo;

public class Lion implements Animal{
    private  Legs legs;
    private int speed;
    @Override
    public void makeSound() {
        System.out.println("Lion makes Roar sound");
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    @Override
    public void getNumberOfLegs() {
        legs.getNumberOfLegs();
    }

    public void setSpeed(int speed) {
        System.out.println("Lion runs at the speed of "+speed);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
