package day39_Recap.cydeoTask;

public class  Person {

    private String name;
    private int age;
    private char gender; // the benefits of having private instance variables through setters and getters to be accessed(get) and changed(set)
                         // later on in the subclass you can set some conditions to them;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //set the constructor using setters;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);// these setters it can also check the conditions if conditions are match those conditions are help us to match the argument;
    }// cannot be inherited but called.

//Methods to be inherited
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

// we can override the toString method later in the subclasses;
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

/*
1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */