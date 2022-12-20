package day39_Recap.cydeoTask;

public class CydeoObjects {
    public static void main(String[] args) {

        Developer dev = new Developer("Emin",35,'M',11,"Java Developer",130000);
        Tester tester = new Tester("AliCan",36,'M',1,"SDET",115000);
        Teacher teacher = new Teacher("Mari",30,'F',15,"Sub Teacher",10000);


        Student student = new Student("Kaysan",23,'M',402,"Programming");

        System.out.println(dev);
        System.out.println(teacher);
        System.out.println(tester);// when you look at the result of these objects it also under Employee class koz toString method was inherited by Employee class;

        System.out.println(student);// but in the Student class toString method is overridden in the class itself that's why it is under Student class output;

// if i wanna change  or reset the attributes how can we do it ? of course by setter method; to read it getter method;
        System.out.println("------------------------------------------");

        dev.setAge(37);
        System.out.println(dev.getAge());// 33
        System.out.println(dev);

        System.out.println("------------------------------------------");

        // some methods are overridden by different  subclasses and that's why even we call the same ex:work(); method from different class in the object class we do have different implementations;
        dev.work();
        tester.work();
        teacher.work();

        System.out.println("------------------------------------------");

        dev.eat();// inherited methods;
        dev.drink();
        dev.sleep();

        dev.fixingBugs();

        System.out.println("------------------------------------------");

        tester.eat();// inherited methods;
        tester.drink();
        tester.sleep();

        tester.createTicket();
        
        System.out.println("------------------------------------------");
        
        tester.eat();// inherited methods;
        tester.drink();
        tester.sleep();

       // tester.fixingBugs();// you cannot call this method koz it's not inherited;

        System.out.println("------------------------------------------");

        student.eat();// inherited methods;
        student.drink();
        student.sleep();

        // student.fixingBugs();// you cannot call these method koz it's not inherited;
       // student.creatingTicket();


        // All in all, CydeoObject Class HAS Developer class,Tester class,.....HAS A Relation;






    }
}
