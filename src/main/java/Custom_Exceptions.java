/*Exception :an event,after exception,that distrupts the normal
*eg:ArithmaticException,ArrayIndexOutOfBoundsException,etc.
*
*User Defined Exception: Custom Exceptions
*eg:AgeException,DuplicateEmail,etc.
* */

import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}
public class Custom_Exceptions {
        public static void main(String args[]){

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            try{
                checkAge(age);
            }
            catch(Exception e)//e is exception object
            {
                System.out.println("A problem occured: "+e);
            }
        }

        static void checkAge(int age)throws AgeException{

            if(age<18) {
                throw new AgeException("\n"+"You must be 18+ to sign up");
            }
            else {
                System.out.println("You are now signed up!");
            }
        }
    }