package org.example;

public class _35_Java_method_overriding {



        public static void main(String[] args) {

            // method overriding = 	Declaring a method in sub class,
            //						which is already present in parent class.
            //						done so that a child class can give its own implementation

            Animal1 animal = new Animal1();
            Dog dog = new Dog();

            dog.speak();//without override method ,it will use most nearest method

        }
    }
    //*******************************************
    class Animal1 {



        void speak() {
            System.out.println("The animal speaks");
        }
    }//*******************************************
    class Dog extends Animal1{

        @Override
        void speak() {
            System.out.println("The dog goes *bark*");
        }
    }
//*******************************************
