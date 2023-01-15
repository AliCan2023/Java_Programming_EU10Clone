package day43_AbstractionIntro.Employee;

import java.util.ArrayList;

public class EmployeeObjects {
    public static void main(String[] args) {

        //Person person = new Person("Jashua",35,'M'); cannot creat object out it since it is an abstract class;
        //Employee employee = new Employee("Ali",33,'M');

        Tester tester = new Tester("Ahmet",33,'M',123,"SDET",120000);
        Devops dev = new Devops("Irfan",32,'M',011,"Java Programmer",180000);
        Teacher teacher = new Teacher("Peri",23,'F',111,"History teacher",85000);
        Driver driver = new Driver("Natasha",30,'F',1122,"Truck Driver",125000);

       /*
       // you cannot reference Testeer to more objects since there is no IS relationship to other objects;
       Tester test = new Tester("Ahmet",33,'M',123,"SDET",120000);
        Tester  dev = new Devops("Irfan",32,'M',011,"Java Programmer",180000);
        Tester teacher = new Teacher("Peri",23,'F',111,"History teacher",85000);
        Tester driver = new Driver("Natasha",30,'F',1122,"Truck Driver",125000);

       ArrayList<Tester>cydeoEmployees = new ArrayList();// instead of using 'Tester' to be referenced we can use 'Employee';
        cydeoEmployees.add(tester);//Only accept tester object ;
        cydeoEmployees.add(dev);//without the polymorphism one class cannot reference to many objects;
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);
        */
        ArrayList<Employee>cydeoEmployees = new ArrayList();// instead of using 'Tester' to be referenced we can use 'Employee';
        cydeoEmployees.add(tester);//
        cydeoEmployees.add(dev);//
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println(tester);
        System.out.println(dev);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("******************************************");

        dev.work();
        dev.sleep();
        //dev.bugReport();//it never was inherited from a parent class; a unique method;
        dev.eat();

        System.out.println("----------------------------------------");

        teacher.work();
        teacher.sleep();
        //teacher.bugReport();
        teacher.eat();




    }
}
