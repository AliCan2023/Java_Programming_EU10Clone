package day42_ExceptionsContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeywords2 {
    public static void main(String[] args) throws InterruptedException {// compiler gives me the exception type already so no need to use Exception parent class;
        System.out.println("Helloo");

        method1();
        method2();
        method3();
        method4();

        String str = null; //NullPointerException is unchecked exception that's why we cannot use throws keyword only use try&catch block;
        try{
        System.out.println(str.charAt(0));

    }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test Completed");

        }


        public static void method1() throws InterruptedException {
            //new FileInputStream("");
            Thread.sleep(1000);
        }
        public static void method2()throws InterruptedException{
            method1();// as you can see the exception occurred again koz throws keyword just avoided the exception not handled it so when you cal the method1(); it comes with the exception;

        }
        public static void method3 () throws  InterruptedException {// same problem occurs again unless you either solve it permanently using try & catch block or throws keyword to avoid it;
            method2();
            Thread.sleep(3000);
        }

        public static void method4() throws InterruptedException {
            method3();
        }
    }

