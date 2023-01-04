package day43_AbstractionIntro.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        //Person person = new Person("Jashua",35,'M'); cannot creat object out it since it is an abstract class;
        //Employee employee = new Employee("Ali",33,'M');

        Tester tester = new Tester("Ahmet",33,'M',123,"SDET",120000);
        Devops dev = new Devops("Irfan",32,'M',011,"Java Programmer",180000);
        Teacher teacher = new Teacher("Peri",23,'F',111,"History teacher",85000);
        Driver driver = new Driver("Natasha",30,'F',1122,"Truck Driver",125000);

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
