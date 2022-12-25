package day41_ExceptionsIntro;


import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        Employee employee = null;
        try {

            System.out.println(employee.getSalary());// what will be the salary of employee???//NullPointerException
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Third Catch block");// this catch block catches the fish ;
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth catch block.");
            e.printStackTrace();
        }
    }
}
