package day50_CollectionReview_Map;

import day17_While_DoWhile.WhileLoopIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //remove all the elements that are less than 4;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)< 4){
                list.remove(i);
            }
        }
        System.out.println(list);

//        The code provided above  is not the correct way to remove elements from a List that are less than 4.
//        The reason is that when you remove an element from the List using the remove() method, the size of the List is reduced by one, but the index of the next element is not updated.
//        So, when you call list.remove(i), the next element will be skipped, resulting in some elements being left in the List that should have been removed.

        System.out.println("===============================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //Remove all the elements that are less than 4;
        Iterator <Integer> iterator = list2.iterator();
        // remove the element in properly;
        // boolean r1 = iterator.hasNext();//call the method to iterate if there is the next element;
        // System.out.println(r1);
        //
        // System.out.println("iterator.next() = " + iterator.next());
        // boolean r2 = iterator.hasNext();
        // System.out.println(r2);
        //
        // System.out.println("iterator.next() = " + iterator.next());
        // boolean r3 = iterator.hasNext();
        // System.out.println(r3);
        // System.out.println("iterator.next() = " + iterator.next());
        //

        while(iterator.hasNext()){
           if(iterator.next() < 4){ //call the iterator from the iterable interface;
               iterator.remove();
           }
        }
        System.out.println("list2 = " + list2);

        System.out.println("===============================================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        //Iterator<Integer> iterator1 = list3.iterator();
        /*
         Iterator<Integer> iterator1 = list3.iterator(); is an object iterator1 of type Iterator<Integer> is being created and initialized. The object itera is an iterator for a list of integers represented by the object list3.

list3 is assumed to be an object of a class that implements the Iterable<Integer> interface, which means that it has a method called iterator() that returns an iterator for the class. The iterator() method is being called on the list3 object, and the returned iterator is being assigned to the itera variable.

Once the iterator1 object is created, it can be used to iterate through the elements of list3. The iterator provides methods such as hasNext() and next() that can be used to traverse the list.

For example, you can use the following code snippet to iterate through all elements of list3:

        while (iterator1.hasNext()) {
    Integer element = iterator1.next();
    // do something with element
}
The Iterator is a powerful tool that allows you to iterate through any object that implements the Iterable interface.
It allows you to traverse the list in a clean and efficient way.
         */

       for(Iterator<Integer> it = list3.iterator(); it.hasNext();){
           if (it.next()<4){
               it.remove();
           }
       }
        System.out.println("list3 = " + list3);

        System.out.println("===============================================================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        list4.removeIf(each -> each <4);
        // creates the iterator and while loop and hasNext(); method everything is provided in the lambda expression ;
        // Lambda expression is the shortcut for Iterator interface;
        System.out.println("list4 = " + list4);


    }
}
