package day49_CollectionContinue;

import java.util.*;

public class QueInterface {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,50,300,45));
        System.out.println("priorityQueue = " + priorityQueue);// NOT keep the insertion order

        Queue<Integer> arrayDeQueue = new ArrayDeque<>();
        arrayDeQueue.addAll(Arrays.asList(10,200,50,300,45));
        System.out.println("ArrayDeQueue = " + arrayDeQueue);// keeps the insertion order

        Queue<Integer> linkedList = new LinkedList<>();// in Polymorphism the reference type decides what you can access;
        linkedList.addAll(Arrays.asList(10,200,50,300,45));
        System.out.println("linkedList = " + linkedList);// keeps the insertion order

        System.out.println("-----------------------");
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeQueue.poll();
        System.out.println("arrayDeQueue = " + arrayDeQueue);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        System.out.println(" **************************************************");

        //System.out.println(priorityQueue.get(1));
        //System.out.println(arrayDeQueue.get()1); they don't have index number so cannot use get method;
        System.out.println(((LinkedList<Integer>) linkedList).get(1));// here in polymorphism plays in role; so we need to do down casting;


    }


}
