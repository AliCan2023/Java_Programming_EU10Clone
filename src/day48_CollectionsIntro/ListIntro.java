package day48_CollectionsIntro;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

       // List is referencing to other classes which have IS a Relationship with as interface;

        //List<Integer> list = new List<>; // List is an interface you cannot create an object out of it;
        List<Integer> list1 = new ArrayList<>();// fastest performances;
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();
    }

}
