package day44_AbstractionContinue_Interface.AnimalTask;

public final class Cat extends Animal implements Playable{ // first override the abstract method of parent class and then call the constructor;
    public Cat(String name, String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }


    @Override
    public void eat() {
        System.out.println(getName()+ " is eating fresh cat food.");

    }

    public void meow() {
        System.out.println(getName() + " is Meowing.");

    }

    @Override
    public void play() {
        System.out.println(getName()+ " is playing with bounce ball.");
    }
}
