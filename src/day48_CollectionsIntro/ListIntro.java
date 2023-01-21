package day48_CollectionsIntro;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

       // List is referencing to other classes which have IS a Relationship with as interface;

        //List<Integer> list = new List<>; // List is an interface you cannot create an object out of it;
        List<Integer> list1 = new ArrayList<>();// fastest one in reference to getting the element;
        list1.addAll(Arrays.asList(10,20,30,40));
        System.out.println(list1.get(1));

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40));//LinkedList is the fastest iin reference to adding and deleting elements;
        System.out.println(list2.get(1));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40));//
        System.out.println(list3.get(1));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40));
        System.out.println(list4.get(1));

        System.out.println("---------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop();//last object will be out from the stack;
        System.out.println(list4);

        //what if I call the pop(); method one more time?
        ((Stack) list4).pop();//last object will be out from the stack;
        System.out.println(list4);

        ((Stack<Integer>) list4).push(60);// push method: push in the last and pop out in the last;
        System.out.println(list4);
    }


    public synchronized void method(){

    }

}
