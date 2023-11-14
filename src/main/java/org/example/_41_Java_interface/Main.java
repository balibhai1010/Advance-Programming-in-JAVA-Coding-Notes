package org.example._41_Java_interface;

public class Main {

    public static void main(String[] args) {
        /*Interfaces = interfaces is a template that can be used/applied in a class,like inheritance,but difference is
        ,class can have multiple interfaces but can inherit only 1 superclass.
         */

        Fish fish = new Fish();

        fish.hunt();
        fish.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

    }
}

