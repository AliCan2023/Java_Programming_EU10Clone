package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;
import day40_ProtectedAccesModifier_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {


        //System.out.println(AccessModifiers_Test4.name1);// after inherited you have to call them by the name of the subclass since the parent's property has also become child class property that's why we use(AccessModifier_Test4.name1/nam2);
        System.err.println(AccessModifiers_Test4.name2);// protected is visible outside the package if it is subclass;

        //AccessModifiers_Test4.method1();// this cannot be called since it is default method;
        AccessModifiers_Test4.method2();







    }


}
