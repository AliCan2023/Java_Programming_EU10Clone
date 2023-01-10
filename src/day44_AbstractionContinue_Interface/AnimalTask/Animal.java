package day44_AbstractionContinue_Interface.AnimalTask;

public abstract class Animal { // this class has to be a parent class;

    private String name;
    private int age;
    private String size;
    private final String breed;
    private final char gender;
    private final String color;

    public final static boolean canBreath;
    static {
        canBreath=true;
        //canBreath=false;// once you set the value of it you cannot change it;
        /*if (canBreath==false){// this condition will ever never be executed koz only one value set to the static variable;so we don't need to create the condition;
            throw new RuntimeException("Invalid");
        }

         */
    }

    public Animal(String name, String breed, char gender, String color, int age, String size) {
       // this.name = name;
        setName(name); // better to use setter in order to set the conditions and values of the Variables;
        //this.age = age;
        setAge(age);
        //this.size = size;
        setSize(size);
        this.breed = breed;
        if (!(gender == 'M' || gender =='F')){// since it is a final variable we ONLY can set the conditions here in the constructor;
            throw new RuntimeException("Invalid gender: " +gender);
        }
        this.gender = gender;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public final void drink(){// prevent overridden of the method make it final;
        System.out.println(name + " is drinking its water");
    }
    public abstract void eat();// Make this method abstract to only focus on the essentials and details to be taken cared of it in the subclass.there are only two ways to have abstract method either you have an abstract class or interface;here in this case
    // we choose the class abstract since I want this class a parent class;

//public abstract void  play();// if something is not common for all subclasses we shouldn't use the abstract method;


    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" + // if you want every other subclass has its own name(Dog,Cat etc) use this getClass().method;
                "name='" + name + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}


/*class Test{ // in order to understand deeply the difference between getName and getSimpleName method;
    public static void main(String[] args) {

        System.err.println(new Test().getClass().getName());
        System.out.println(new Test().getClass().getSimpleName());
    }

 */

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake
 */
