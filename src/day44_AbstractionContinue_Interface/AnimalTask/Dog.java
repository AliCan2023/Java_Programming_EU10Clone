package day44_AbstractionContinue_Interface.AnimalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name,String breed, char gender, String color, int age, String size) {
        super(name, breed, gender, color, age, size);
    }

    public void bark(){
        System.out.println(getName()+ " is barking.");

    }

   // @Override// just to check overridden or not;
    public void eat() {
        System.out.println(getName() + " is eating Lahmacun.");

    }


    @Override
     public void play() {
        System.out.println(getName() + " is playing soccer ball.");

    }
}

