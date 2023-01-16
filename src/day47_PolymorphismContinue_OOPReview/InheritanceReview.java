package day47_PolymorphismContinue_OOPReview;

public class InheritanceReview {// futures are not common for the child classes should not be placed.
    // parent class cannot be final;

    int a;

   // public InheritanceReview(){ // if the constructor is default the child class call it implicitly
    public InheritanceReview(int a){// if it is not default child must call the constructor;
        System.out.println("Parent Class' instructor.");
    }

    void method1(){

    }




}
class A extends  InheritanceReview{

    public A(int a) {
        super(a); // only constructor that can call parent class constructor and use super key word;
                   // super keyword is correlated with inheritance;
    }
}
class B extends InheritanceReview{

    public B(int a) {
        super(a);
    }
}
class C extends InheritanceReview{

    public C(int a) {
        super(a);
    }
}
class aa extends A{

    public aa(int a) {
        super(a);
    }
}
class bb extends B{

    public bb(int a) {
        super(a);
    }
}
class cc extends C{

    public cc(int a) {
        super(a);
    }
}
class D{
    void m(){
        super.toString();// this one is from Objects class;not from the class we used as a parent;
    }
}