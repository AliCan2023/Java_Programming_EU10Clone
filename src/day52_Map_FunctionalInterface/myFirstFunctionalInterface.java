package day52_Map_FunctionalInterface;

@FunctionalInterface
public interface myFirstFunctionalInterface {

    //Interface is meant to be inherited but Functional interface is like custom method;
    // create an abstract method with a parameter

    void apply(int n);// by using lambda expression to provide the implementation;
    //void method(); // this is Functional Interface so that cannot be inherited and there is only one abstract method;
    // if the abstract method only passing one parameter using the parenthesis is optional if it is more than one it is a must;





}
