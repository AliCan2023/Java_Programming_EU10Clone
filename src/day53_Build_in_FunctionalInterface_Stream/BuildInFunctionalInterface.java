package day53_Build_in_FunctionalInterface_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface { //predicate takes one value  and returns boolean;

    public static void main(String[] args) {
//1. Build in Functional Interface: Predicate;

        Predicate<String> isPalindrome = (p) -> { // we can reuse this below;
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equals(p);
        };

        boolean result1 = isPalindrome.test("racecar");
        boolean result2 = isPalindrome.test("Java");

        System.out.println(result1);
        System.out.println(result2);

        Predicate<Integer> isEven = (p) -> p % 2 == 0; // we are going to use this below again;
//        boolean result = isEven.test(5);
//        System.out.println(result);

        System.out.println("--------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4));
        //list.removeIf(isEven);or you can use lambda expression here;
        //list.removeIf(p -> { return  p %2==0;});// you don't have to have the curly bracket if there is only one implement;
        list.removeIf(p -> p % 2 == 0);

        System.out.println(list);

        System.out.println("--------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("level", "anna", "Java", "Python"));
        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("-----------------------------------------------");

        //2. Build in Functional Interface: Consumer;

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("------------------------------------------------");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

//        for (Integer each : list1) {
//            if (each % 2 != 0){
//                System.out.println(each);
//            }
//     }
        list1.forEach(c -> { if (c%2!=0) System.out.println(c);});

        System.out.println("------------------------------------------------");
        List<String> employees = new ArrayList<>();
        employees.addAll(
                Arrays.asList("Ali Can Bugraoglu","Aygul Azmet","Batu Noyan","Irfan Azim","Tom Cruise"));

        employees.forEach(s-> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("------------------------------------------------");

        //3. Build in Functional Interface: Function; // The Most useful interface; takes one type and returns any value any type;

        Function<int[], List<Integer>> convertToList ;
        convertToList = (a)-> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> newList = convertToList.apply(arr);

        System.out.println(newList);

        System.out.println("------------------------------------------------");

        // convert List<Integer> to Array[int];

        Function<List<Integer>, int[]> convertToArray = (l)-> {
            int[] result = new int[l.size()];//array size is fixed, you have to decide the size first;
            for (int i = 0; i < l.size(); i++) {

                result[i] = l.get(i);
            }
            return result;
        };
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,55,6));
       int[] result3 =  convertToArray.apply(numbers);
        System.out.println(Arrays.toString(result3));

        System.out.println("---------------------------------------------");

        //create a function that can return the maximum number from an int array;


    }
}
