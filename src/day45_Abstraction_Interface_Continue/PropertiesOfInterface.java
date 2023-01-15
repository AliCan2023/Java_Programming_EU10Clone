package day45_Abstraction_Interface_Continue;

public interface PropertiesOfInterface { // interface  is a super type not a super class;

    final int a = 111; // variables are static and final by default;so only a final variable to be initialized right after it is created;
    static int b = 222;// same here;

    /*
        public PropertiesOfInterface(int a ){ // once this is interface you cannot have constructor;
            this.a=a;
        }
     */
    /*
    static{ // static block is meant to execute when the class is ready first to run but interface is not a class;
        b=100;
    }

     */
    /*
    public void method1(){ // in instance method you need to have an object but interface has not have an object since it is not a class;
        System.out.println("Instance method");
    }

 */

    public static void method2() { // After java 8 static method can be used;
        System.out.println("Static method");
    }



    public abstract void method3();// unless the class is abstract class;
    //But once you turn  this class into interface you wouldn't have....

    // one more method was introduced before the static method introduced which is default method;
    public default  void method4() {
        System.out.println("default method.");

        class Test implements PropertiesOfInterface {// first override the abstract method;

            @Override
            public void method3() {

            }

           /* public static void main(String[] args) {
                new Test().method4();// we call the instances through the object; and here default method of interface becomes the instance method of the object class;

            }

            */
        }


    }
}
