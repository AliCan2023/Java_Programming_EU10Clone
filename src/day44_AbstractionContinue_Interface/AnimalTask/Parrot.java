package day44_AbstractionContinue_Interface.AnimalTask;

public final class Parrot extends Animal implements Playable,Flyable{


    public Parrot(String name, String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating chocolate.");

    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with the owner.");

    }

    @Override
    public void fly() {
        System.out.println(getName()+ " cannot fly as high as an eagle can.");
    }
}
