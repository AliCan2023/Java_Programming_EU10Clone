package day43_AbstractionIntro.Employee;

public final class Devops extends Employee {

    public Devops(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is writing the codes");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps only 5 hours a day");

    }

    public void unitTest(){
        System.out.println(getName()+ " is doing the unit test.");
    }
}
