package Unit4Assessemnt;

public class Phone {

static int number;

public Phone(String str){
    this(str.length());
}
public Phone(int num){
    this();
    number += num;
}
public Phone(){
    number += 1;
}

}
class CallPhones{
    public static void main(String[] args) {
        new Phone("iphone");
        new Phone();
        new Phone(4);
        System.out.println(Phone.number);

    }
}
/*
n this code, you have a class Phone with three constructors: a default constructor, a constructor that takes an int argument, and a constructor that takes a String argument. The class also has a static variable number, which is initialized to 0.

In the main method of the CallPhones class, you create three objects of the class Phone using the different constructors. Here is what happens when each object is created:

You create an object using the constructor that takes a String argument: new Phone("iphone"). This constructor calls the constructor that takes an int argument with the length of the String as an argument. The int constructor then calls the default constructor and increments number by 1. Finally, the int constructor increments number by the value of the num argument, which is the length of the String ("iphone" has length 6).
You create an object using the default constructor: new Phone(). This increments number by 1.
You create an object using the constructor that takes an int argument: new Phone(4). This constructor calls the default constructor and increments number by 1. Finally, it increments number by the value of the num argument, which is 4.
After all three objects have been created, the value of Phone.number is 13 (1 + 1 + 6 + 1 + 4). When you call System.out.println(Phone.number), it prints the value of Phone.number, which is 13.

I apologize for the error in my previous response. I hope this clears up any confusion. Please let me know if you have any other questions.




 */