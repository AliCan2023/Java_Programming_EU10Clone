package day50_CollectionReview_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Kavak", "level", "Alia", "civic", "radar", "river", "racecar"));
        // remove all palindromes from the list above;
        // call the iterator method;
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String eachStr = it.next();// no need to create a custom method in interview; use the loop;
            String reverse = ""; // use decremental iterator;
            for (int i = eachStr.length() - 1; i >= 0; i--) {
                reverse += eachStr.charAt(i);
                //System.out.println("reverse = " + reverse);
            }
            if (eachStr.equalsIgnoreCase(reverse)) {
                it.remove();
            }
        }
        System.out.println("names = " + names);

        System.out.println("--------------------------------------------");

        //Using functional Interface Lambda expression and Predicate interface;

        List<String> names1 = new ArrayList<>();
        names1.addAll(
                Arrays.asList("Java", "Kavak", "level", "Alia", "civic", "radar", "river", "racecar")
        );

        Predicate<String> palindromes = str -> {// if the body of lambda expression needs more than one statement we need to use Predicate interface;
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
                //System.out.println("reverse = " + reverse);
            }
            return reverse.equalsIgnoreCase(str);
        };

        names1.removeIf(palindromes);
        System.out.println("names1 = " + names1);


    }
}
