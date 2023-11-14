package org.example;

public class _24_printf {
    public static void main(String[] args) {
                // printf() = 	an optional method to control, format, and display text to the console window
                //				two arguments = format string + (object/variable/value)
                //				% [flags] [precision] [width] [conversion-character]
                // System.out.println("%d qqqqq",11);is error
        System.out.printf("%dpercent good%n",100);
        System.out.printf("%d%% good%n", 100);

                boolean myBoolean = true;
                char myChar = '@';
                String myString = "Bro";
                int myInt = 50;
                double myDouble = 1000;
                // [conversion-character]
                // i.e. b,c,s,d,f
                System.out.printf("%b %n",myBoolean);
                System.out.printf("%c %n",myChar);
                System.out.printf("%s %n",myString);
                System.out.printf("%d %n",myInt);
                System.out.printf("%f %n",myDouble);
                //[width]
                // minimum number of characters to be written as output
                System.out.printf(" Hello %10s%n",myString);//"      Bro" are 10 char
                System.out.printf(" Hello %-10s%n",myString);//"Bro      "
                //[precision]
                // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %f%n",myDouble); //1000.000000
        System.out.printf("You have this much money %.1f%n",myDouble); //1000.0
                // [flags]
                // adds an effect to output based on the flag added to format specifier
                // - : left-justify
                // + : output a plus ( + ) or minus ( - ) sign for a numeric value
                // 0 : numeric values are zero-padded
                // , : comma grouping separator if numbers > 1000
        System.out.println();
        System.out.printf("You have this much money %f%n",myDouble);
        System.out.printf("You have this much money %20f%n",myDouble); //"         1000.000000"
        System.out.printf("You have this much money %-20f%n",myDouble);//"1000.000000         "
        System.out.printf("You have this much money %+f%n",myDouble);
        myDouble = -1000;
        System.out.printf("You have this much money %+f%n",myDouble);
        myDouble = 1000;
        System.out.printf("You have this much money %020f%n",myDouble);//0000000001000.000000
        System.out.printf("You have this much money %,f%n",myDouble);//1,000.000000
            }
        }


