package day44_AbstractionContinue_Interface.AnimalTask;

public interface Playable {

     boolean isFriendly = true; // accepts static by default and final variable

    /*
    public static void method1(){
        System.out.println(isFriendly); // if the variable is not static the static method CANNOT call it directly;
    }

     */

     void play(); //Acccess modifier is public by default and abstract method by default  & static method also accepted;
}
