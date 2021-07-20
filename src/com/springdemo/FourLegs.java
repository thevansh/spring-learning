package com.springdemo;

public class FourLegs implements Legs{
    @Override
    public void getNumberOfLegs() {
        System.out.println("Four Legs");
    }
}
