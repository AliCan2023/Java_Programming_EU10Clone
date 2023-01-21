package day_49CollectionContinue;

import java.util.*;

public class SetInterfacePractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon","Wooden Spoon", "Wooden Spoon","Milk","Eggs","Coke","Paper towels"};

// create an object that is eligible for garbage collection as soon as finish using;
       arr= new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);// already converted to an array using toArray method;

        //arr = new LinkedHashSet<>(Arrays.asList()).toArray(new String[0]);// FILO

        /*Set<String> set1 = new HashSet<>(Arrays.asList(arr));//using the asList. method turn arr into arrayList;
        //converting Set into Array.
        arr = set1.toArray(new String[0]);//toArray comes from collection;


        System.out.println(set1);

         */

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer>


    }
}
