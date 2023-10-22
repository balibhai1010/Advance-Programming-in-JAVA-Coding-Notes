//******************************************************
public class _27_2_Human {
    String name;

    int age;

    double weight;


    _27_2_Human(String name, int age, double weight) { // _27_2_Human is a constructor


        this.name = name;

        this.age = age;

        this.weight = weight;

    }


    void eat() {

        System.out.println(this.name + " is eating");

    }

    void drink() {

        System.out.println(this.name + " is drinking *burp*");

    }


}
