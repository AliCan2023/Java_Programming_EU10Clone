package day40_ProtectedAccesModifier_FinalKeyword;

public class Cat extends Animal { // but final class can be a child class/subclass
    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    } // since you change the class type of Dog to final it cannot be inherited anymore parent class now;

}
