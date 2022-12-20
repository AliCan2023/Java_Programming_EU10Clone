package day40_ProtectedAccesModifier_FinalKeyword;

public class FinalVariables {
    // make instance variables and static variable final;
    //public final String language;// final instance variable
    //public final static double pi;// final static variable  // you gotta initialize them right after you create the final variables by constructors;
     final String birthDay;
     final static String name;
     static{
         name = "EU10";// you can always reassign  static variable but not the final static variable one;
     }

    /*public FinalVariables(String language) {
        this.language = language; //once the  final instance variables created you gotta set the constructor right away; and when the object created initializes one time and cannot change the value;
        //this.pi=3.33; cannot change the value once it is assigned;
    }
    static{
        pi=3.14;
    }

     */

    /*public FinalVariables(String language, String birthDay) {
        this.language = language;
        this.birthDay = birthDay;
    }

     */

    public FinalVariables(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final int number = 10;
        //number = 20;// this is final variables so you cannot reassign the value to it;
        final String name;
        name = "Java";
        //name = "Wooden spoon";// since the above is final variable you cannot change the value;
        System.out.println(name);

        System.out.println("-------------------------");

        FinalVariables obj = new FinalVariables("June/23rd");// the moment you create the object this is the first and final assignment and cannot change it;
       // obj.birthDay= "May/01"; // you cannot reassign it;
        System.out.println(obj.birthDay);

        System.out.println("-------------------------");

        // let's call the static variable and try to change its value;
       // FinalVariables.name = "Batch25";// even though it is the static variable but once it becomes the final you also cannot reassign it again;
        System.err.println(FinalVariables.name);




    }
}
