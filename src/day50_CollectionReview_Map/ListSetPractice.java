package day50_CollectionReview_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));
        System.out.println("set = " + set);

        //Integer[] array = set.toArray(new Integer[0]);//converting set into array;
        List<Integer> list =  new ArrayList<>(set);
        System.out.println("list = " + list);

        List<String> names = null;// you will get null pointer exception;
        //System.out.println(names.size());

        System.out.println("----------------------------------------------");

        //pop();  LIFO--->last in first out;
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println("chars = " + chars);
        //chars.pop();//you need to group cast first to call pop() method;
        ((Stack)chars).pop();
        System.out.println("chars = " + chars);

        ((Stack)chars).pop();

        List<Character> chars1 = new ArrayList<>();
        chars1.addAll(Arrays.asList('W','X','Y','Z'));
       // ((Stack)chars1).pop();// will have ClassCastException here koz between the object ArrayList and Stack class has no IS Relationship;
       //chars1.pop();
        System.out.println(chars1);

        System.out.println("***************************************************");
        //poll(); FIFO--->>first in first out;

        List<String> names1 = new LinkedList<>();
        names1.addAll(Arrays.asList("Ali","Batu","Mustafa","Elyar","Patime"));
        System.out.println("names1 = " + names1);

        //poll(); but cast it to LinkedList class;
        ((LinkedList<String>)names1).poll();
        System.out.println("names1 = " + names1);


    }
}
