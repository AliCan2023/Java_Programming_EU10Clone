package day49_CollectionContinue;

import java.sql.Array;
import java.util.*;

public class SetInterfacePractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

// create an object that is eligible for garbage collection as soon as finish using;

        //arr= new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);// already converted to an array using toArray method;

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);// FILO
        // why do we need Array? koz Array is the fastest one to retrieve an element;

        /*Set<String> set1 = new HashSet<>(Arrays.asList(arr));//using the asList. method turn arr into arrayList;
        //converting Set into Array.
        arr = set1.toArray(new String[0]);//toArray comes from collection;


        System.out.println(set1);

         */

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 300, 1000, 200, 300, 400, 5500, 5500, 600, 10, 10, 20, 30, 40, 20, 10, 40));

        //list = new LinkedHashSet<>(list)// cannot make it reference to ArrayList;
        //if you wanna convert this into new ArrayList you will make sure that the constructor of new ArrayList;
        list = new ArrayList<>(new LinkedHashSet<>(list)); //convert LinkedHashSet to ArrayList and passing back to the list reference; collection type I am passing;

        System.out.println(list);

        System.out.println("------------------------------------------");
        String[] array = {"Ali", "Batu", "Elyar", "Mustafa", "C"};

        //Set<String> s = new LinkedHashSet<>();
        List<String> s = new ArrayList<>(Arrays.asList(array));
        //s.addAll(array);//you gotta pass a collection type(List,Queue,Set. one of them;
        //s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("Ali", "Batu", "Elyar", "Mustafa", "C"));// in this case you duplicate or add another lements of group directly using Arrays.asList()method;
        System.out.println(s);

        System.out.println("---------------------------------------");
        /*
        Given:
        Integer[] nums= {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10}
        return the fifth element after removing the duplicates
        Do not change the order of the elements;// you can us the Set;
         */
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 4, 5, 8, 9, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// This old reference would be collected by the garbage collector;

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);// use constructor of LinkedHashSet; cannot assign back to array nums
                                                                // koz arrays and LinkedHashSet has no relationship;
        //nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[15]); //what if I pass the length of elements in array 15? in this case passing elements to the LinkedHashSet is certain number(smaller than 15;
                                                               // for the remaining elements of new array it assigns 'null' by default;
                                               // so whenever we convert any collection type to Array the best thing to pass for the length of new array is'0' which is the smallest index for an array that contains;
        System.out.println(Arrays.toString(nums));


        System.out.println("---------------------------------------");

        String str = "aaaaabbbbbccccdddeeeeee";// we convert this String to Array then to ArrayList;

        String result = "";// a4b4c4d3e4

        // let's create an array out of the String; str.split();
        // then this array has to be  converted to any collection type by using Arrays.asList();

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")),each);// here the first argument must be a collection type;
            result += each + count;

            /*
           result += each + Collections.frequency(Arrays.asList(str.split("")),each);
             */
        }
        System.out.println(result);

        System.out.println("--------------------------------------------------------");


        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet","Ahmet","Ali","Kasim","Jacob","Bernard","Jane","Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);
        //or convert Set to ArrayList using constructor to convert it pass the set names;
        System.out.println(new ArrayList<>(names).get(2));

        for (String each : names) { //
            System.out.println(each);// takes out every name/element of a Data Structure;

        }




    }
}
