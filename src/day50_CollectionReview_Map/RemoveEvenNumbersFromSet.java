package day50_CollectionReview_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvenNumbersFromSet {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 90, 88, 77, 44, 33));
        // Remove even numbers from the elements of set;
        // 1.the easiest way to do it using lambda expression;

        set.removeIf(number -> number % 2 != 0);
        System.out.println("set = " + set);

        //2. what if there is no lambda expression?!

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 90, 88, 77, 44, 33));
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("set1 = " + set1);


    }
}
