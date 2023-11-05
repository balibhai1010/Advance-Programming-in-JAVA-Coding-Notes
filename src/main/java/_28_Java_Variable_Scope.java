import java.util.Random;
// INSTANCE
// In object-oriented programming, an instance refers to a specific occurrence or realization of a class,
// which is a blueprint or template for creating objects.
// An instance, also known as an object, is created from a class
// and represents a unique entity with its own set of data and behavior.
//ALL TYPES?

public class _28_Java_Variable_Scope {


        public static void main(String[] args) {

            //local =  declared inside a method
            //   visible only to that method

            //global  = declared outside a method, but within a class
            //   visible to all parts of a class

            DiceRoller diceRoller = new DiceRoller();

        }

    static class DiceRoller {

            // WE DECLARED OUTSIDE BECAUSE ITS GLOBAL,
        //ELSE,WHEN DECLARED INSIDE OF THESE 2,THERE WILL BE 2 VARIABLES WITH DIFF LIVES IN THESE 2
        //way 1 declare outside
        Random random;
        int number;

        DiceRoller(){
            random = new Random();
            roll();
        }

        void roll() {
            number = random.nextInt(6)+1;
            System.out.println(number);
        }
//way 2 declare at parameters
        void roll(Random Random,int number) {
            number = random.nextInt(6)+1;
            System.out.println(number);
        }
    }
}
