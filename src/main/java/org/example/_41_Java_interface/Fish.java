package org.example._41_Java_interface;

//********************************************
public class Fish implements Prey, Predator {


    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");

    }

    @Override
    public void flee() {
        System.out.println("*The fish is fleeing*");

    }
}
