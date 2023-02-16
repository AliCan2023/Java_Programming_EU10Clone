package day52_Map_FunctionalInterface;

public class Test {

    //lambda: () -> {}
    public static void main(String[] args) {
// if I use costume method I have to create three methods and consumes more memories;
        //By using Functional Interface just use one abstract method to function;
        // function1 : creat a function that can display a number is odd
        myFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number.");
            }
        };

        oddOrEvenNumber.apply(20);

        //function2: create a function that can check if a person is eligible to buy drink;
        myFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol = age -> {  // abstract method has only one parameter to pass so the parenthesis is optional;
            if (age >= 20) {
                System.out.println("The person is eligible to buy alcohol.");
            } else {
                System.out.println("Not eligible to buy alcohol.");
            }

        };

        eligibleToBuyAlcohol.apply(23);

        //function3: create a function that can display the cube of a number;

        myFirstFunctionalInterface printCube;
        printCube = (n) -> System.out.println(n * n * n);// here again the curly braces are optional when there is only one implementation;

        printCube.apply(5);

        // create a function that can check if a number ie evenly divisible to 3 & 5;

        myFirstFunctionalInterface  divisibleBy3And5 = n -> {
            if (n %15==0){
                System.out.println(n + " is divisible by 3 and 5 .");
            }else {
                System.out.println(n + " is not divisible by 3 and 5.");
            }
        };
        divisibleBy3And5.apply(45);

    }
}
