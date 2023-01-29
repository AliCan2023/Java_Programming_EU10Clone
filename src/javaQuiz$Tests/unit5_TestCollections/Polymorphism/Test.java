package javaQuiz$Tests.unit5_TestCollections.Polymorphism;

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.methodA();
    }


    }
    class A{
        protected void methodA(){
            System.out.println("Method A");
        }

        }


    class B extends A{
        public void methodA(){
            System.out.println("Method C");
        }
        public void methodB(){
            System.out.println("Method B");
        }
    }


