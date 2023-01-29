package javaQuiz$Tests.unit5_TestCollections.Abstraction;

/*public abstract class Data {
    //public abstract static void printHello();// cannot use static specifier;A static method cannot be abstract because it is already a complete implementation.
    public abstract void printHello();
}

public  class Test extends Data{
    @Override
    public  void printHello(){
        System.out.println("Hello Cybertek");
    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.printHello();
    }

}

 */
public abstract class Data {
    public abstract void printHello();
}
/*
The use of the abstract keyword on the printHello() method in the Data class is incorrect. A static method cannot be abstract because it is already a complete implementation.
The use of the static keyword on the printHello() method in both the Data and Test classes is also incorrect. An abstract method should not have the static keyword because it needs to be overridden by subclasses.
The use of the final keyword on the Test class is incorrect. The final keyword prevents a class from being subclassed, but Test is already a subclass of Data.
In the main method, the object of Test class is created and calling the method printHello() which is static method and static method can be called by class name directly so no need of creating object.
To fix this code, you can remove the abstract keyword from the printHello() method in the Data class, remove the static keyword from the printHello() method in both the Data and Test classes, and remove the final keyword from the Test class.

Instead of creating object of the class you can call the method by class name directly.


 */

