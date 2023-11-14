package org.example;

//******************************************************
//Constructors = A special method that is called when an object is instantiated(created)
//void? When a method's return type is void, it means the method doesn't return any value.
//static: This keyword means that the method is associated with the class itself, rather than an instance of the class.
//Static methods are called on the class itself, not on an object created from that class.
// This means you don't need to create an instance of the class to call a static method.
// They are often used for utility methods or for operations that don't require access to instance-specific data.
//public: This is an access modifier that specifies the visibility of the method. When a method is declared as public,
// it can be accessed from anywhere in your program. Other common access modifiers include private (accessible only within the
// class it's declared),
// protected (accessible within the class and its subclasses), and package-private (no access modifier,
// accessible within the same package).
public class _27_1_Constructors {



    public static void main(String[] args) {



        _27_2_Human Human1 = new _27_2_Human("Rick",65,70);
//constructors gives opportunity to create different objects with different attributes
        _27_2_Human Human2 = new _27_2_Human("Morty",16,50);



        Human1.drink();

        Human2.eat();



    }

}
//******************************************************