package day45_Abstraction_Interface_Continue;

public class Extend_vs_Implements extends A implements X,Y,Z {// first extends then implements

}
    //Extend"

    class C{


    }
    class A {

    }
    //class B extends A ,C{// multiple inheritance is not allowed in the class but in interface is fine with multiple inheritance;}
    interface Z{

    }
    interface  Y{

    }
    interface X extends Y,Z {

    }



