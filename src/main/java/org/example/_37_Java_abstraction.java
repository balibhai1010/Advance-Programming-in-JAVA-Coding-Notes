package org.example;

public class _37_Java_abstraction {
        public static void main(String[] args) {

            // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
            //				abstract methods are declared without an implementation

            //org.example.Vehicle1 vehicle = new org.example.Vehicle1(); }so we cant use this line ,because its too big /nonsense acc.to our plan (security ,yay!!!)
            Car4 car = new Car4();

            car.go();
        }
    }
    //****************************************
    abstract class Vehicle1 { //abstract class

        abstract void go(); //abstract method (all vehicles should go)
    }
    //****************************************
    class Car4 extends Vehicle1{

        @Override
        void go() {
            System.out.println("The driver is driving the car");

        }
    }
//****************************************