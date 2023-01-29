package javaQuiz$Tests.unit5_TestCollections.Abstraction;

public class Test extends Data {
    @Override
    public void printHello() {
        System.out.println("Hello Cybertek");
    }

    public static void main(String[] args) {
        Test obj = new Test();

        obj.printHello();
    }
}
