package day42_ExceptionsContinue;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("--------------------------Push up Started--------------------------");

        for (int i = 0; i <= 30; i++) {
            System.out.print("\rpush up " + i);// \r: rewrite escape sequences;
            sleep(0.5);

        }
        System.out.println("--------------------------Push up completed--------------------------");


        System.out.println("--------------------------Pull up Started--------------------------");
        for (int i = 0; i <= 20; i++) {
            System.out.print("\rpull up " + i);// \r: rewrite escape sequences;

            sleep(2.5);

        }
        System.out.println("--------------------------Pull up completed--------------------------");


    }

    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */