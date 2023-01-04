package day43_AbstractionIntro.Employee;

public abstract class Person { // the grand parent class;

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {// if i have the setters here it makes me easier to set the values of the variables;

        setName(name);
        setAge(age);
        setGender(gender);
    }

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

        if (age <=0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender =='F' || gender =='M')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public abstract void sleep();// wanna be able to ignore all the details in the parent class;
    // If oyu don't know how many implementation of the method at present you'd better set it abstract and worry about the details later on;

    public  void eat(){
        System.out.println(name + " is eating baklava");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
