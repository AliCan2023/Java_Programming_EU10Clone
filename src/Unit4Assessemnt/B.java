package Unit4Assessemnt;
public class B {
    static int count;

    // Constructor that increments the value of 'count' by 1
    public B() {
        count ++;
    }

    // Constructor that increments the value of 'count' by the value of the 'i' argument
    public B(int i) {
        count += i;
    }

    // Method that increments the value of 'count' by the length of the 's' argument
    public void B(String s) {
        count += s.length();
    }
}

class Test {
    public static void main(String[] args) {
        // Create an object using the default constructor
        new B();

        // Create an object using the default constructor and assign it to the variable 'a'
        B a = new B();

        // Uncomment the following lines to create objects using the other constructors:
        // B a2 = new B(6);
        // B a2 = new B("word");

        // Call the 'B' method on the object 'a' with the argument "word"
        a.B("word");

        // Create an object using the constructor that takes an 'int' argument
        B a3 = new B(5);

        // Print the value of the 'count' static variable
        System.out.println(B.count);
    }
}


/*public class B {
    static int count;

    public B(){
        count ++;
    }
    public B(int i){
        count += i;
    }
    public void B(String s){
        count += s.length();
    }
}
class Test {
    public static void main(String[] args) {
        new B();
        B a = new B();
        //B a2 = new B(6);
        //B a2 = new B("word");
        a.B("word");
        B a3 = new B(5);
        System.out.println(B.count);
    }
}

 */
/*
In this code, you have a class B with three members: a static variable count, a default constructor, and a method named B. The class also has a constructor that takes an int argument, but it is not used in this code.

In the main method of the Test class, you create three objects of the class B using the default constructor and assign the first two objects to the same variable a. You also call the B method on the object a with the argument "word", which increments the value of count by the length of the String ("word" has length 4). Finally, you create an object using the constructor that takes an int argument and increments the value of count by the value of the int argument (5).

The final value of B.count is the sum of all the increments performed on it, which is 1 + 1 + 4 + 5 = 11. When you call System.out.println(B.count), it prints the value of B.count, which is 11.
 */