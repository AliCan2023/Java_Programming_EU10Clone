package day44_AbstractionContinue_Interface.AnimalTask;

public final class Eagle extends Animal{


    public Eagle(String name, String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating a snake.");

    }
}
