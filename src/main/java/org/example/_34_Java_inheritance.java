package org.example;

public class _34_Java_inheritance {
    public static void main(String[] args) {

        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        Car3 car = new Car3();

        car.go();

        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();

        System.out.println(car.door);
        System.out.println(bike.pedals);

    }
}
//*************************************
class Vehicle{//super-class /parent class i.e. ancestor
    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }
}
//*************************************
class Car3 extends Vehicle{//subclasses /child classes ie. decendants
    int wheels = 4;
    int door = 4;
}
//*************************************
class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;
}
//*************************************


