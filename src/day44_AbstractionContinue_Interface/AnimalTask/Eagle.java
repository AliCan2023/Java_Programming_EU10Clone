package day44_AbstractionContinue_Interface.AnimalTask;

public final class Eagle extends Animal implements WildAnimal,Flyable{


    public Eagle(String name, String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating a snake.");

    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting a goat.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " can fly the highest altitude a bird can fly.");
    }
}
