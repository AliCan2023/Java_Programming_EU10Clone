package day40_ProtectedAccesModifier_FinalKeyword;

public class FinalVariables {
    // make instance variables final;
    public final String language;// final instance variable
    public final static double pi;// final static variable  // you gotta initialize them right after you create the final variables by constructors;

    public FinalVariables(String language) {// final only initializes one time and cannot change the value;
        this.language = language;
        //this.pi=3.33; cannot change the value once it is assigned;
    }
    static{
        pi=3.14;
    }

    public static void main(String[] args) {

        final int number = 10;
        //number = 20;// this is final variables so you cannot reassign the value to it;



    }
}
