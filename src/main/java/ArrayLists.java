import java.util.ArrayList;



public class ArrayLists{



    public static void main(String[] args) {



        // ArrayList = 	a resizable array.

        //				Elements can be added and removed after compilation phase,which cant be done at standard array

        //				store reference data types



        ArrayList<String> food = new ArrayList<String>();
        //String (wrapper class)
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.set(0, "sushi");
        food.remove(2);


        //to show elements in food
        //food.size() is used
        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
        food.clear();
        System.out.println(food);

    }

}