package day42_ExceptionsContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {


        System.out.println("Enter your age:");//what if user enter -18;

         Scanner scan = new Scanner(System.in);
         int age= scan.nextInt(); // or merge these two line into like this: int age = new Scanner(System.in).nextInt();

        if (age<0){
            /*System.err.println("Invalid age " + age);
            System.exit(1);//instead of creating a condition and exit method we can throw an exception;

             */
            throw new InputMismatchException("Invalid age " + age);//Runtime Exception has a construction that allows you to print the message;
        }

        if (age >21){
            System.out.println("You are eligible ");
        }else{
            throw new RuntimeException("You must be at least 21");
        }
        scan.close();
    }
}
