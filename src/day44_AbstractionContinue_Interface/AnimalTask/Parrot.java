package day44_AbstractionContinue_Interface.AnimalTask;

public final class Parrot extends Animal{


    public Parrot(String name, String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating chocolate.");

    }
}
