package day53_Build_in_FunctionalInterface_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        //1.stream().distinct() method in Java, the distinct() method is used to return a stream with distinct elements based on their natural order or a specified comparator.
        // When used with the stream() method, it creates a new stream with only the distinct elements from the original stream.

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8));
//        list.stream().distinct();// stream is unable to change data structure
//        System.out.println(list);
        list = list.stream().distinct().collect(Collectors.toList());// you have to assign it back to the original var;

        System.out.println(list);

        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------------------------");
        //2.stream().skip(). method in java is used to skip the first n elements from a stream.
        // It returns a new stream consisting of the remaining elements after the first n elements have been skipped.
        //Syntax:Stream<T> skip(long n)

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));//eliminate the first five elements;
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // in array we call stream method from the arrays utility class ;
        nums1 = Arrays.stream(nums1).skip(4).toArray();

        System.out.println(Arrays.toString(nums1));

        System.out.println("----------------------------------------");

        //3.The stream().limit() method in Java is used to limit the size of the stream to a specified number of elements.
        // It returns a new stream that contains only the first n elements from the original stream,
        // where n is the number specified in the limit() method.

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list3 = list3.stream().limit(7).collect(Collectors.toList());
        System.out.println(list3);
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());// we can use two stream methods at the same time;
        System.out.println(list3);

        System.out.println("----------------------------------------");
        //one of the most useful method:
        //4.The stream().map() method is a method in Java that is used to apply a function to each element of a stream and return a new stream with the results.
        // It takes a lambda function as its argument, which is applied to each element of the stream.

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));// I want to multiply each element by 5;
        list4 = list4.stream().map(p -> p * 5).collect(Collectors.toList());
        System.out.println(list4);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days = days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList());
        System.out.println(days);

        System.out.println("----------------------------------------");
        //one of the most useful methods:
        //5.The filter() method takes a Predicate functional interface as an argument, which is used to define the condition for filtering the elements.
        // The Predicate functional interface takes a single input argument and returns a boolean value, indicating whether the input satisfies the condition or not.

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));//filter even numbers
        List<Integer> evenNumbers = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("----------------------------------------");

        //6.The stream().count() method in Java is used to return the count of elements in a stream.
        // It returns a long value representing the number of elements in the stream.
        // This method is a terminal operation that marks the end of the stream pipeline.

       List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));//how many numbers in the list evenly divisible by 3;
        System.out.println(list6.stream().filter(p -> p % 3 == 0).count());

        List<String> names = new ArrayList<>(Arrays.asList("Java", "Python", "JaVa", "Ruby", "JAVA", "java", "C#"));
        long countJava = names.stream().filter(p -> p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);

        //7.The stream().forEach() method is a way to iterate over the elements of a Java Stream and perform an action on each element.
        // The forEach() method takes a functional interface called a Consumer, which represents an operation that takes an argument and returns no result.
        //Syntax:stream.forEach(Consumer<T> action)

        names.stream().filter(p-> p.equalsIgnoreCase("Java")).forEach(p-> System.out.println(p));

        System.out.println("----------------------------------------");

        //8,9,10. allMatch(),anyMatch() , noMatch() methods returns boolean;

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
        boolean r1 = list7.stream().allMatch(p->p%2==0);// all numbers are not evens in the list so it returns us false;
        System.out.println(r1);

        boolean r2 = list7.stream().anyMatch(p-> p >15);// even you have one element to meet the condition it returns us true;
        System.out.println(r2);

        boolean r3 = list7.stream().noneMatch(p-> p>=20);
        System.out.println(r3);


    }
}
