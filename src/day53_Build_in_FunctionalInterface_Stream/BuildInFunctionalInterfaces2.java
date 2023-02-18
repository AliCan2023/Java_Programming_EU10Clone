package day53_Build_in_FunctionalInterface_Stream;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {

    public static void main(String[] args) {
        //create a function that can return the maximum number from an int array;

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }
            }

            return result;
        };
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean r1 = contains.test(arr, 11);// let's check if arr contains 11;
        System.out.println(r1);

        System.out.println("-------------------------------------------");
        //create a function that can check if two strings are anagram; // create the string to array and check
        //                                   a= bac , b = cab   a and b---> anagrams
        BiPredicate<String, String> anagram = (t, u) -> { // abstract method of functional interface has two parameters the parenthesis is a must;
            // create arrays from both two strings first;
            String[] arr1 = t.split("");// [b ,a ,c]
            String[] arr2 = u.split("");// [c, a ,b]

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2); // when you use the equals method you might get in trouble since it compares by the index numbers;
        };

//        String[] arr1 = {"b","a","c"};
//        String[] arr2 = {"c","a","b"};
//        boolean r2 = anagram.equals(arr1);//?????
//        System.out.println(r2);

        System.out.println("------------------------------------------");
        // create a function that can print the given string for given number of times;

        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Java", 5);

        //creat a function that takes first and last names and print formatted full names;
        //  "jAvA", "PROGRAMMING"----> Java Programming;
        //Do it yourself!!!

        System.out.println("-----------------------------------------------");

        Map<String, String> ScrumTeam1 = new LinkedHashMap<>();
        ScrumTeam1.put("Ali", "QA");
        ScrumTeam1.put("Batu", "SDET");
        ScrumTeam1.put("Ensar", "Dev");
        ScrumTeam1.put("Maria", "PO");
        ScrumTeam1.put("Mustaf", "SM");

        ScrumTeam1.forEach((k, v) ->
                System.out.println(k + ":" + v));
        //before lambda expression we used entrySet.for(); codes lines are shorten using lambda expression but
        // lambda is not readable by all QAs and a new method to be used ;

       /* for (Map.Entry<String, String> each : ScrumTeam1.entrySet()) {
            String k = each.getKey();
            String v = each.getValue();

            System.out.println(k + ":" + v);

        }

        */

        System.out.println("----------------------------------------");

        //1.create a function that takes two integers and returns the maximum integer;
        BiFunction<Integer, Integer, Integer> maxNumber = (a, b) -> a > b ? a : b;//used ternary

        int max = maxNumber.apply(50, 100);
        System.out.println(max);

        //2.Create a function that can merge two integer arrays into a list;

        BiFunction<int[], int[], List<Integer>> merge = (t, u) -> {
            List<Integer> result = new ArrayList<>();

            for (int each : t) result.add(each);

            for (int each : u) result.add(each);

            return result;
        };

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(merge.apply(arr1, arr2));

        System.out.println("---------------------------------");

        //3.create a function that takes a list of String and a list of Integer combines them return  a map;
        /*
        List<String>
        names => {"Ali", "Jashua","Daniel"}

        List<Integer>
        score=> {100,90,85}

        map==> {Ali = 100, Jashua = 90, Daniel = 85}


         */

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge1 = (n, s) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < s.size(); i++) {
                map.put(n.get(i), s.get(i));
            }
            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Jashua","Daniel"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(100,90,85));

        Map<String,Integer> students = merge1.apply(names,scores);

        System.out.println(students);


    }
}
