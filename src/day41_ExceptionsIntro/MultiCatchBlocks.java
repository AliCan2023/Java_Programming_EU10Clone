package day41_ExceptionsIntro;


import com.sun.security.jgss.GSSUtil;
import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        Employee employee = null;
        try {

            System.out.println(employee.getSalary());// what will be the salary of employee???//NullPointerException

        } catch (NullPointerException e) {
            System.out.println("First catch block.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Second catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Fourth Catch block");// this catch block catches the fish ;
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Fifth catch block.");
            e.printStackTrace();
        }
        System.out.println("Test Completed");

        System.out.println("------------------------------------------------------");
        try{

        System.out.println("Java".charAt(-1));
    }catch (RuntimeException e ){
            e.printStackTrace();
        }
        }
    }
