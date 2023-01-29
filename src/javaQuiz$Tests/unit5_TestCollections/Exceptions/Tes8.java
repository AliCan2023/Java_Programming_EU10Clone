package javaQuiz$Tests.unit5_TestCollections.Exceptions;

public class Tes8 {
    public static void main(String[] args) {


        pause1();//line1
        //pause2();//line2
    }
    public static void pause1(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
    public static void pause2() throws InterruptedException {
        Thread.sleep(3000);
    }
}
