package org.example._40_Java_copy_objects;
public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("Chevrolet","Camaro",2021);

        //car2.copy(car1); //WITH JUST BASICS OF GETTER ANS SETTER USAGES         this.setMake(x.getMake()); //OMG THIS IS GREAT
        //car2 = car1; is f**king wrong ,it will make both obj pointed to same address org.example._40_Java_copy_objects.Car@2a84aee7
        Car car2 = new Car(car1);//        this.setMake(x.getMake()); //OMG THIS IS GREAT + overloaded constructor

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}