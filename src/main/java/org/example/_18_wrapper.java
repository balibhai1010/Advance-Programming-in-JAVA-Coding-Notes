package org.example;

public class _18_wrapper {

    public static void main(String[] args) {

        // wrapper class =  provides a way to use primitive data types as reference data types
        //                  reference data types contain USEFUL METHODS (TO ACCESS THEM WRITE VAR AND THEN ".")
        //                  can be used with collections (ex.ArrayList)
        // Wrapper classes are classes that wrap these primitive data types, providing objects that can be used in an object-oriented context.
        //                  but slower than primitive data type (more memory and processing power and time)

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean
        // char   Character
        // int   Integer
        // double  Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.to treat them as primitive

        Boolean a = true; //they are autoboxing
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String bb = "bali";
        //useful methods
        System.out.println(bb.toUpperCase());
        System.out.println(c.toString());
        System.out.println(a.hashCode());
        //etc
        //we will use ArrayLists at next code ;)
        int value = c; // Unboxing from Integer to int

        if (a==true || b=='@'){
            System.out.println("this goes unboxing");
        }

        Integer x = 10;
        Integer y = 10;
        if (x.equals(y)) {
            System.out.println("Equal");
        }

/*
When comparing values using wrapper objects,
it's essential to use the .equals() method or to rely on
auto-unboxing. Using == for comparison checks if the references
are the same, not the actual values.



 */




    }

}