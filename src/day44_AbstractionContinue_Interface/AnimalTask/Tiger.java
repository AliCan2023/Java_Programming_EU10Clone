package day44_AbstractionContinue_Interface.AnimalTask;

public final class Tiger extends Animal implements WildAnimal{


    public Tiger(String name, String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating a deer.");

    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts deer.");
    }
}
