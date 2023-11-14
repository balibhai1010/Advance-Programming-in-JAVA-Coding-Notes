package org.example;

public class _3_swap_variables {
    public static void main(String[] args) {
        String x = "water";

        String y = "Kool-Aid";

        String temp;



        temp = x;

        x=y;

        y=temp;



        System.out.println("x: "+x);

        System.out.println("y: "+y);

    }

}
