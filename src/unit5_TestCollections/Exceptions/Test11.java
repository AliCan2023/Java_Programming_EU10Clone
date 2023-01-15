package unit5_TestCollections.Exceptions;

public class Test11 {
    static int a = 50;
    public static void main(String[] args) { //line2

        a= 100;
        try{

            a = 200;
        } catch (Exception e){
            a=300;
        }finally {
            a = 400;
        }
        System.out.println(a);

    }

    static{
        a = 500;
    }
}
/*
Explanation:

The static variable 'a' is initially set to 50.
Next, the static block is executed and the value of 'a' is set to 500.
Then the main method is called.
Within the main method, the value of 'a' is set to 100.
Then the try-catch block is executed and within the try block, the value of 'a' is set to 200.
Next the finally block is executed and the value of 'a 'is set to 400.
Finally, the System.out.println(a) statement is executed and the output is 400.
 */
