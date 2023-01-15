package day45_Abstraction_Interface_Continue.Shape;

public interface Volume {//in one interface you can have as many of them as you want but only one is public which has the same with the file;

    static final boolean hasVolume = true;

    abstract double volume();

    // default method after Java 8 to cover up the instance method. so the only way that you can create an implementation in interface is to creat default method.
    /*default void drink() {//default method after being inherited to subclass it will be treated as instance method and can be overridden;
        System.out.println("Drinks water");
    }

     */

    abstract class QQQ{

    }
    interface QQ{

    }


}
