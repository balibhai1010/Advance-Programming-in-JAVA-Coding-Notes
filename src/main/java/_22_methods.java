public class _22_methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        // main 1st execute
        // static ?
        int x = 3;
        int y = 4;
        int z = add(x,y);//x,y are arguements
        //x,y,z are local variables
        System.out.println(z);

        // during input .arguement should match parameters
    }
    static int add(int a, int b) {//x,y sre parameters and int datatype is returned
        // naming,1st letter lowercase
        int z = a + b;
        return z;
    }
}