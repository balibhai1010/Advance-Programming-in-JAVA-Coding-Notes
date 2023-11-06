public class _30_Java_to_string_method {


        public static void main(String[] args) {

            // toString() = special method that all objects inherit,
            //    that returns a string that "textually represents" an object,i.e. address.
            //    can be used both implicitly and explicitly
            /*
              public String toString() {
                    return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
            *
            *
            *
            *
            * */


            Car1 car = new Car1();

            //Explicit
            System.out.println(car.toString()); //      eg: Car1@2a84aee7 without override

            // or
            //Implicit way
            System.out.println(car);//      eg: Car1@2a84aee7 without override


        }
    }
    //***************************************
    class Car1 {


        String make = "Ford";
        String model = "Mustang";
        String color = "red";
        int year = 2021;

        public String toString() {

            return make +"\n"+model+"\n"+color+"\n"+year;

        }
    }
//***************************************



