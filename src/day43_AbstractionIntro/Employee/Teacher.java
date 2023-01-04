package day43_AbstractionIntro.Employee;

public final class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching right now");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps 8 hours a day.");

    }
}
