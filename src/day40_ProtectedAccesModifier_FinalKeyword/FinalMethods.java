package day40_ProtectedAccesModifier_FinalKeyword;

public class FinalMethods {

    public final void method() {
        System.out.println("Java Programming");
        // if I want to change the implementation at any time it gives me a compile error since this method is final;
    }
}
// if I try to override this method let's see what happens;
/*
class B extends FinalMethods{
@Override
    public void method(){
        System.out.println("Python is also a programming language");
        //since the method is finale in the parent class it cannot be overridden;
    }


}


 */