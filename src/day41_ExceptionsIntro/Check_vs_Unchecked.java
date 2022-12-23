package day41_ExceptionsIntro;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Check_vs_Unchecked {

    public static void main(String[] args) {
        // unchecked Exception; occurs during the runtime

        int a = 10;
        int b = 0;

        //System.out.println(a / b);// unchecked exception at the same time it would terminate your code;
       // System.out.println("Silver Spoon");// cannot executed;

        char[] characters = {'A','B','C'};
        //                    0    1  2
        //System.out.println(characters[88]); //all the exceptions in java from Java.lang. package;

        Student student = null;// this null keyword does not reference any object;object doesn't exist means u cannot use the instance;

        //System.out.println(student.getName());//unchecked exception;

        //student.study();

        String str = "Silver Spoon"; // now this object becomes unreferenced and all unreferenced objects are eligible for garbage collection;
        //but by using final keyword we can prevent the object to be collected by garbage collector;
        //str= null;// null is not object

       // System.out.println(str.toUpperCase());

        String str1 = ""; // even this is empty string but the object != null; even this string is blank  it is also string object;
        System.out.println(str1.isEmpty());

        //checked exception; occurs during the compile time

        System.out.println("Hello");

        //Thread.sleep(2000);// needs immediate handle;

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");// but here compile is not happy easy to tell checked exception;

        System.out.println("Java".charAt(33));// unchecked exception compile is ok with that.















    }


}
