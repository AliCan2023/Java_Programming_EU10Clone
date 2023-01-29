package javaQuiz$Tests.Unit4Assessemnt;

public class A {
    // Declare an instance variable called "count" of type int.
    int count;

    // Declare a method called "m" that takes no arguments.
    public void m(){
        // Increment the value of the "count" variable by 1.
        count++;
    }

    // Declare a method called "m" that takes an int argument called "n".
    public void m(int n) {
        // Multiply the value of the "count" variable by the value of "n".
        count  *= n;
    }

    // Declare the main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create a new object of the A class and assign it to a variable called "obj".
        A obj = new A();

        // Call the "m" method with an argument of 5 on the "obj" object.
        obj.m(5);

        // Call the "m" method with no arguments on the "obj" object.
        obj.m();

        // Add 10 to the value of the "count" variable of the "obj" object.
        obj.count += 10;

        // Call the "m" method with an argument of 2 on the "obj" object.
        obj.m(2);

        // Print the value of the "count" variable of the "obj" object to the console.
        System.out.print(obj.count);
    }
}
