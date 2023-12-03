package org.example;





public class _73_Java_method_chaining {



        public static void main(String[] args) {

            // method chaining = 	a common syntax for invoking multiple method calls in OOP
            //						condense code into less lines

            String name = "      bro";

            //name = name.concat(" code   ");
            //name = name.toUpperCase();
            //name = name.trim();

            name = name.concat("code").toUpperCase().trim();

            System.out.println(name);

        }
}
