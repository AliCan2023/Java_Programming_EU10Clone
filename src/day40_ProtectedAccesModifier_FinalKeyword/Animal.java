package day40_ProtectedAccesModifier_FinalKeyword;

public class Animal {
    // different type of instance variables;
    private String name;
    private final  String breed;// declare these vars final;
    private final char gender;
    private final String color; // you need to set the constructors for these three final variables;
    private String size;
    private int age;


    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }


}
