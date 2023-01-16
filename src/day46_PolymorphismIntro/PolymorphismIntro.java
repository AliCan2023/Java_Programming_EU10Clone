package day46_PolymorphismIntro;

import day43_AbstractionIntro.Employee.*;
import day44_AbstractionContinue_Interface.AnimalTask.Animal;
import day44_AbstractionContinue_Interface.AnimalTask.Cat;
import day44_AbstractionContinue_Interface.AnimalTask.Dog;
import day44_AbstractionContinue_Interface.AnimalTask.Playable;
import day45_Abstraction_Interface_Continue.Shape.*;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Silver Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = true;

        //String[] array = {str,n1,n2,r1};// it wouldn't all types of dat in the case of String array.
        Object[] array = {str, n1, n2, r1};// object is the generic name and the parent class of all classes;so it would accept the all types of dat;
        Object[] array1 = {str, n1, n2, r1, new Circle(5), new Square(8)};//Object could be anything ;it can include anything which is relation to anything;

        /*

        WebDriver driver // is relationship for all of them; one referencing could reference different objects;
        driver =  new ChromeDriver();
        driver = new FireFOxDriver();
         */

        // since Employee reference type is the parent of all subclasses (IS relationship) we could reference it many times ;

        Employee tester = new Tester("Ahmet", 33, 'M', 123, "SDET", 120000);
        Employee dev = new Devops("Irfan", 32, 'M', 011, "Java Programmer", 180000);
        Employee teacher = new Teacher("Peri", 23, 'F', 111, "History teacher", 85000);
        Employee driver = new Driver("Natasha", 30, 'F', 1122, "Truck Driver", 125000);

        //ArrayList<Employee> cydeoEmployees = new ArrayList();// instead of using 'Tester' to be referenced we can use 'Employee';
        ArrayList<Person> cydeoEmployees = new ArrayList();// instead of using 'Employee' to be referenced we can use 'Person' since it is the grandfather of all classes here ;
        cydeoEmployees.add(tester);//
        cydeoEmployees.add(dev);//
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("--------------------------------------------------------------");

        Employee employee = new Tester("Ahmet", 33, 'M', 123, "SDET", 120000);
        employee.work();// let's suppose that this method  has multiple different implementations; when dev works they do develops when driver works they drive;
        // it depends on the object type: if the object type is a tester then the work(); method implemented;
        //employee.bugReport();gives error. why I cannot call the method which belongs to Tester class?
        //Another important rule of Polymorphism is the poly only occurs when the parent  is to referenced
        //In java reference type always decides what you can access;

        Employee employee1 = new Devops("Irfan", 32, 'M', 011, "Java Programmer", 180000);
        employee1.work();// At first, it looks like the method from parent class but here in polymorphism implemented the overridden version of the method;


        Employee employee2 = new Teacher("Peri", 23, 'F', 111, "History teacher", 85000);
        employee2.work();

        /*
        WEbDriver driver1 = new ChromeDriver();
        WebDriver driver2 - new ChromeDriver();

        driver1.get(amazon);
        driver2.get(google); all calling the chrome driver since the object  type is ChromeDriver;

        Animal animal = new Dog();
        animal.drink(); // in this case it prints out the original method that animal class has
        but if you override the method in Dog class in this case it implements the Dgo class drink(); method;

        Animal animal1 = new Cat();// if the cat class has overridden the drink() method ;
        animal.drink();// in this  case it implements the overridden method that Cat class has;

         */
        System.out.println("****************************************");
        Animal animal = new Dog("Alexa", "Husky", 'F', "white and black", 3, "small");
        animal.drink(); // reference type decides what method  to be called;
        animal.eat();
        //animal.play();// cannot call the method koz it is not the property of reference type .

        System.out.println("---------------------------------------------");
        Dog animal1 = new Dog("Alexa", "Husky", 'F', "white and black", 3, "small");
        animal1.drink(); // reference type decides what method  to be called;
        animal1.eat();
        animal1.play();// since reference type is Dog and object type is also Dog we can all any properties of Dod class in this case;
        animal1.bark();

        System.out.println("--------------------------------------------");

        Playable animal2 = new Dog("Alexa", "Husky", 'F', "white and black", 3, "small");
        // interface name is also seen as a reference type name since it is also inherit sth to the subclass;
        System.out.println(animal2.isFriendly);
        animal2.play();// here in this two properties that we can call because the reference type(Playable) has the properties;
        // animal2.eat();
        //animal2.drink();// but here these two methods DO NOT belong to the properties of Playable;

        System.out.println("****************************************");

        Animal animal3 = new Cat("Alexa","ScottishFold",'F',"gray",1,"small");
        animal3.drink();
        animal3.eat();
       // animal.scratch();// cannot call the method; reference type decides the property to inherit;

        System.out.println("-----------------------------");
        Shape shape = new Circle(8);
        shape.area(); // which method is to get implemented decided by the object type so here Circle area() method get executed;
        // how can I verify if this Shape is Square?

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);

        /*
        how do i know the chrome browser or safari or foxfire open?

        WebDriver driver; // driver could be chrome or firefox or safari;

        if(driver instanceof Chrome){
             Chrome browser will open
        }else if(driver instanceof firefox){
             firefox browser will open.
             }



         */


    }
}
