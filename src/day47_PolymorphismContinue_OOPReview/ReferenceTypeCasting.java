package day47_PolymorphismContinue_OOPReview;

import day43_AbstractionIntro.Employee.*;
import day44_AbstractionContinue_Interface.AnimalTask.Animal;
import day44_AbstractionContinue_Interface.AnimalTask.Cat;
import day44_AbstractionContinue_Interface.AnimalTask.Dog;
import day45_Abstraction_Interface_Continue.Shape.Circle;
import day45_Abstraction_Interface_Continue.Shape.Cube;
import day45_Abstraction_Interface_Continue.Shape.Shape;
import day45_Abstraction_Interface_Continue.Shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        Shape shape = (Shape) new Circle(5);//upcasting so you don't need to do casting manually.
        // upcasting is done implicitly by compiler on the  background; without the casting changing the type is IMPOSSIBLE;

        Shape shape2 = new Circle(5);
        //WebDriver driver = (ChromeDriver) new ChromeDriver();

        /*System.out.println("-----------------------------------------------");
        //Upcasting
        Dog dog = new Dog("Alexa", "Husky", 'F', "white and black", 3, "small");
        Dog dog1 = dog;//Upcasting type and it is done automatically;
        dog1.eat();
        dog1.drink();
        dog1.bark();
         */
        System.out.println("-----------------------------------------------");
        //DownCasting
        Animal animal = new Dog("Alexa", "Husky", 'F', "white and black", 3, "small");
        Dog dog = (Dog) animal;// I want to use it again so assign it to dog variable;
        // what if I create different Dog object?!
        //Dog dog = new Dog("Max", "Kangal", 'M', "bej", 3, "large");// this consumes more memory so i don't wanna create a new object;
/*
        //animal.drink();
        //animal.eat();
        //animal.bark();// cannot access to the method koz it is child class property but by DownCasting you can use the method of the child;

        // Dog dog = (Dog) animal; // you cannot assign parent type to child type directly in this case, you need to Downcast here;
        //((Dog)animal).bark();//grouping by placing the parentheses and executes first priority; downcasting; if I don't use this more than once then use this type of casting ;
*/
        dog.bark();
        System.out.println(animal.getName());//Alexa
        System.out.println(dog.getName());//Alexa

       //animal.bark();
        dog.bark();

        System.out.println("-----------------------------------------------");

        Shape shape1 = new Square(6);

        System.out.println(((Square) shape1).getSide());//shortcut: Option + Enter--->Cast qualifier to' package';
        System.out.println("shape.area() = " + shape1.area());//6*6;

        System.out.println("-----------------------------------------------");

        Animal animal3 = new Cat("Tom","ScottishFold",'F',"gray",1,"small");
        //if i want to use the new reference type more than once I have to assign it to a variable of an object;
          //Cat cat = (Cat) animal3;

        //cat.meow();

        ((Cat) animal3).meow();// casting is done before you call the method that's why we use grouping ();
        //can I call the bark(); method?
        //animal3.bark();// gives compile error;
        // but when I do downcasting to Dog reference let's see then
        //( (Dog)animal3 ).bark(); // when I run the program I happen to see a ClassCastException thrown;
        // because there is no IS Relationship between two objects Dog and Cat; cat is not a dog or dog is not a cat:)

        System.out.println("---------------------------------------------");

        Employee employee = new Tester("Ahmet", 33, 'M', 111, "SDET", 130000);
        employee.work();
        ((Tester) employee).bugReport();
        //((Tester)employee).unitTest();//Tester does not have unitTest method gives compile error;
        //((Devops)employee).unitTest();// no compile error but throws the ClassCastException;

        //Driver driver = (Driver) employee;// employee object is Tester so it throws ClassCastException;
        Person person = (Person) employee;// there is a  IS Relationship existed (Upcasting);
        //Teacher teacher = (Teacher) employee;// no IS relationship

        System.out.println("-------------------------------------------");

        Shape s1 = new Circle(11);
        System.out.println("s1.area() = " + s1.area());
        System.out.println("s1.perimeter() = " + s1.perimeter());
        //((Cube)s1).volume();

    }
}
