package day40_ProtectedAccesModifier_FinalKeyword;

public class Animal {
    // different type of instance variables;
    private String name;
    private final  String breed;// declare these vars final;
    private final char gender;
    private final String color; // you need to set the constructors for these three final variables;
    private String size;
    private int age;

   /* public void setGender(char gender){
        this.gender=gender; // even you try to give a value here it gives you error;
    }

    */


    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }


// since we have final instance variables we cannot call the setter method here but only getter method to be called;
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }


    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }
    // let's see if we can generate  6 setters;
    // as you can see we can only generate 3 setters since they are not final variables;


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //------------------------methods
    // I want this method to be implemented in different ways in different objects of Animal class
    // by overriding the method therefore I  did not add the final key word;
    public void eat(){
        System.out.println(name + " is eating");

    }

    //here I want this method to get implemented in the same ways for all objects of Animal class therefor i added final keyword;
    public final void drink(){
        System.err.println(name + " is drinking water.");

    }
}
