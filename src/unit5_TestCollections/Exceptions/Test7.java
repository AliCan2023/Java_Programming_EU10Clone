package unit5_TestCollections.Exceptions;

public class Test7 {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        } catch (NullPointerException e) {
            System.out.println("NUll is caught");
        } catch (RuntimeException e) {
            System.out.println(" Run is caught");
        } //catch (ArithmeticException e) {
           //System.out.println(" Arthmetic is caughut ");
        //}

    }
}
