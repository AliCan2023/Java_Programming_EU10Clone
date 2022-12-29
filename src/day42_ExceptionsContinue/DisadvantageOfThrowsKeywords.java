package day42_ExceptionsContinue;

public class DisadvantageOfThrowsKeywords {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");
        sleep(3.5); //throws method
        System.out.println("Java World");

        System.out.println("---------------------------------------------");
        System.out.println("Hello");
        MorningWorkout.sleep(2.5);//try&catch block
        System.out.println("Cydeo");



    }
    public static void sleep(double seconds) throws InterruptedException {

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

