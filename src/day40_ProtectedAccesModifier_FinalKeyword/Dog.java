package day40_ProtectedAccesModifier_FinalKeyword;

public final class Dog extends Animal{
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    public void eat() {
        System.out.println( getName()+ " is eating dog food");
    }

    /*public final void drink(){ // but the method we declared is final in the super class so...
        System.err.println(getName()+ " is drinking beer");;
    }

     */
    public void bark(){
        System.out.println(getName()+ " is barking");
    }
}