package day43_AbstractionIntro.Employee;

public final class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is testing the application");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+ "  sleeps 5 hours a day.");

    }

    public void bugReport(){// this is the method which is unique to this class and make the class final;

        System.out.println(getName()+ " is creating bug reports");

    }
}
