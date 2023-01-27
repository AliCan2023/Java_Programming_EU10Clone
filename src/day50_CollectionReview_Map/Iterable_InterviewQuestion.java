package day50_CollectionReview_Map;

import java.util.*;

public class Iterable_InterviewQuestion {
    public static void main(String[] args) {
        //remove the name Ali;
        List<String> employeeNames = new ArrayList<>();
        employeeNames.addAll(Arrays.asList(
                "Ali", "Ali", "Batu", "Mustafa", "Senem", "Ali", "Elyar", "Patime", "Ali", "Jessica", "ali"
        ));

        employeeNames.removeAll(Arrays.asList("Ali"));// this old way can ignore the case the sensitivity;
        System.out.println("employeeNames = " + employeeNames);// this is not proper way to remove the elements;

        //bear in mind that when you remove the elements from any types of collection you MUST use Iterator from the Iterable;
        //1. without using the lambda expression; Use while loop;

        Iterator<String> ite = employeeNames.iterator();
        while (ite.hasNext()) {
            if (ite.next().equalsIgnoreCase("Ali")) {
                ite.remove();
            }
        }
        System.out.println("employeeNames = " + employeeNames);

        System.out.println("===================================================");
        //2. using for loop;
        List<String> employeeNames2 = new ArrayList<>();
        employeeNames2.addAll(Arrays.asList(
                "Ali", "Ali", "Batu", "Mustafa", "Senem", "Ali", "Elyar", "Patime", "Ali", "Jessica", "ali"
        ));

        for (Iterator<String> ite1 = employeeNames2.iterator(); ite1.hasNext(); ) {
            if (ite1.next().equalsIgnoreCase("ALi")) {
                ite1.remove();
            }
        }
        System.out.println("employeeNames2 = " + employeeNames2);

        System.out.println("===================================================");

        List<String> employeeNames3 = new ArrayList<>();
        employeeNames3.addAll(Arrays.asList(
                "Ali", "Ali", "Batu", "Mustafa", "Senem", "Ali", "Elyar", "Patime", "Ali", "Jessica", "alley"
        ));

        employeeNames3.removeIf(each -> each.equalsIgnoreCase("Ali"));
        System.out.println("employeeNames3 = " + employeeNames3);

        System.out.println("===================================================");
        // Iterator can be used any subclass or child interfaces of Collection;
        //Remove the number that is even;
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 40, 50, 60, 100, 99));

        Iterator<Integer> number = set.iterator();

        while (number.hasNext()) {
            if (number.next() % 2 == 0) {
                number.remove();
            }
        }

        System.out.println("set = " + set);


    }
}
