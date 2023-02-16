package day52_Map_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {

        mySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);

            }
        };
        printEach.test("Silver Spoon");

        mySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);
        cube.test(4);

    }
}
