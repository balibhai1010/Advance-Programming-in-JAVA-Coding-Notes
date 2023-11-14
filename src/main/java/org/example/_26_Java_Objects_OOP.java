package org.example;

//*******************************************
//Object = an instance of class that may contain attributes and methods
//attributes : characteristics the object has
//methods : actions the object can perform
//eg: laptop,cup,phone,bed laptop table
public class _26_Java_Objects_OOP {
    public static void main(String[] args) {
//constructing instance of another class
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        myCar1.drive();
        myCar1.brake();
    }
}
//*******************************************
class Car {
//car is working as blueprint for new objects to be make
//Attributes
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;
//Methods
    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }
}
//*******************************************