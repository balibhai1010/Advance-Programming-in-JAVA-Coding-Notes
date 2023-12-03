package org.example;
enum Planet{
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    YOURANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    Planet(int number){
        this.number = number;
    }
}

public class _74_Java_enum {
    public static void main(String[] args) {

        //enum = enumerated (ordered listing of items in a collection)
        //in java ,they are constant
        //grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.PLUTO;

        canILiveHere(myPlanet);

    }

    static void canILiveHere(Planet myPlanet){

        switch(myPlanet) {
            case EARTH:
                System.out.println("You can live here :)");
                System.out.println("This is planet #"+myPlanet.number);
                break;
            default:
                System.out.println("You can't live here...yet");
                System.out.println("This is planet #"+myPlanet.number);
                break;
        }
    }
}
