package day41_ExceptionsIntro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test Started.");

        try { // catches checked exceptions;
            System.out.println(9 / 0);
            System.out.println("Try Block");

        } catch (ArithmeticException e) { //catches unchecked exceptions;
            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred.");

        }

        System.out.println("Test Completed.");

        System.out.println("-------------------------");

        System.out.println("Test2 started");
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        } //catch (ArrayIndexOutOfBoundsException e1) {// you cannot use any other Exceptions class here;if you don't know which exception class without executing the code you had better use
          // parent Exception class which is Runtime Exception class;
        catch (RuntimeException a) {
            a.printStackTrace();// most preferred one if the exception happens during the runtime;gives full details of the exception;
            //System.out.println(a.getMessage());//.getMessage(); gives oyu brief description of exceptions;


            /*System.out.println("Catch block");
            //System.out.println("Index Out of Bounds Exception occurred.");
            System.out.println("Runtime Exception was occurred.");

             */
        }
        System.out.println("Test2 completed.");


        System.out.println("------------------------------");

        System.out.println("Test3 started.");
        try{
        System.out.println("Cydeo".substring(2,0)); // might give you uncheck exception(runtime exception) and compile cannot tell what the exception type is.

        }catch (RuntimeException b){
            b.printStackTrace();
        }
        System.out.println("Test3 completed.");

        System.out.println("---------------------------------------------");


        System.out.println("Hello");


        try { //if try block doesn't catch the exception it goes to catch block but here this block hast catch and the catch block doesn't execute but...????
            Thread.sleep(3000);//compiler tells me that Interrupted Exception
        } catch (InterruptedException e) {
            e.printStackTrace(); // strongly recommended to get full detailed explanation
        }

        System.out.println("Cydeo");

        System.out.println("-----------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
