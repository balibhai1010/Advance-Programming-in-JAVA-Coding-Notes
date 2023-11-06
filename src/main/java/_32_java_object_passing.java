public class _32_java_object_passing {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car2 car1 = new Car2("BMW");
        Car2 car2 = new Car2("Tesla");

        garage.park(car1);
        garage.park(car2);
        System.out.println(garage.carlist());

    }
}

//********************************************
class Garage {
    Car2[] cars = new Car2[2];
    int currentIndex = 0;

    void park(Car2 carname) {
        if (currentIndex < cars.length) {
            cars[currentIndex] = carname;
            System.out.println("The " + carname.name + " is parked in the garage");
            currentIndex++;
        } else {
            System.out.println("The garage is full. Cannot park " + carname.name);
        }
    }

    String carlist() {
        return "Carlist :"+cars[0]+","+cars[1] ;
    }
//At Output ,how to make other elements in that line? sout's way is also tested but still......
//Carlist :BMW
//,Tesla


}

class Car2 {


    String name;
    public String toString() {

        return name+"\n";

    }
    Car2(String name) {
        this.name = name;

    }



}


