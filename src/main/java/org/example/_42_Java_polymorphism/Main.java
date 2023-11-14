package org.example._42_Java_polymorphism;


//**************************************
public class Main {

    public static void main(String[] args) {

        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x : racers) {// for(datatype varible : array)
            x.go(); //this is polymorphism....computer science bitchhhhhh!!!!!!!!!!!!
        }

    }
}

//**************************************