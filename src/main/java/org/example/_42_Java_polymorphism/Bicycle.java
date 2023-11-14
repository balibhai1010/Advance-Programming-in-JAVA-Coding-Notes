package org.example._42_Java_polymorphism;

//**************************************
public class Bicycle extends Vehicle {


    @Override //good manners
    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
}
