package day41_ExceptionsIntro;

public class FinallyBlock {// later we use it in a back end testing;
    // every singe class is implicitly inherited from all the object classes . object is the parent of all the classes by default;
    // Finalize():everytime when the finalize method to be called the object is meant to be cleaned from Java heap memory; This method is automatically called as long as the object is unreferenced;


    public static void main(String[] args) {


        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch block");
            e.printStackTrace();
            System.exit(0); //only this case the finally block doesn't get executed;stopped by System.exit(0);of
        } finally {
            System.out.println("Finally BLock");
        }


    }
}
