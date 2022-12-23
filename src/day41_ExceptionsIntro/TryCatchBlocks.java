package day41_ExceptionsIntro;

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
        int[] numbers = {1,2,3,4,5};

try {
    System.out.println(numbers[200]);
    System.out.println("Try Block");
}catch(ArrayIndexOutOfBoundsException e1){
    System.out.println("Catch block");
    System.out.println("Index Out of Bounds Exception occurred.");

}


        System.out.println("Test2 completed.");





    }
}
