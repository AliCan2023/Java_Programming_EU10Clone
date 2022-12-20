package day40_ProtectedAccesModifier_FinalKeyword;

public class ZooObjects {
    public static void main(String[] args) {
        // final variables/Constructors/Methods can be called depending on static or instance;
        //if it is static call by class name;if it is instance call by objects;


        Dog dog = new Dog("Max", "GermanShepherd", 'M', "white and black", "big", 3);
        //final indicates un-changible whether it is variable or method or class;

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();// only implementation for all classes doesn't mean cannot be called;  ;


    }
}
