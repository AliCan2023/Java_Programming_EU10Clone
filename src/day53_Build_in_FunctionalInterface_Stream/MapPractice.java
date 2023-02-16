package day53_Build_in_FunctionalInterface_Stream;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 6.0);
        unit1.put("Escape Sequences", 3.0);
        unit1.put("Primitives", 6.0);
        unit1.put("Operators", 9.0);
        unit1.put("If statements ", 9.0);
        unit1.put("Switch statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods ", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Method", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance ", 13.5);
        unit5.put("Final KeyWord", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 14.5);
        unit6.put("OOP Polymorphism", 8.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> allUnits = new ArrayList<>();
        allUnits.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));
        System.out.println(allUnits.size());
        //System.out.println(allUnits);

        //1.Display each Java Topic and its hours on the console;

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
            }
        }
        System.out.println("-----------------------------------------------");

        //2.Display the names of Java topics that we spent more than 7 hours;

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                if (eachEntry.getValue() >= 7) {
                    System.out.println(eachEntry.getKey());
                }
            }
        }
        System.out.println("------------------------------------------------");

        //3.Display the names of the java topics that we spent less than 3 hours;

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                if (eachEntry.getValue() < 3) {
                    System.out.println(eachEntry.getKey());
                }
            }
        }
        System.out.println("-----------------------------------------------");

        //4.Which Java topic has the maximum hours;
        //5.Which Java topic has minimum hours;

        double max = Double.MIN_VALUE;
        String nameOfMax = "";

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                if (eachEntry.getValue() > max) {
                    max = eachEntry.getValue();
                    nameOfMax = eachEntry.getKey();

                }
            }
        }

        double min = Double.MAX_VALUE;
        String nameOfMin = "";

        for (Map<String, Double> eachUnit : allUnits) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                if (eachEntry.getValue() < min) {
                    min = eachEntry.getValue();
                    nameOfMin = eachEntry.getKey();

                }
            }
        }

        System.out.println("the topic has maximum hours is " + nameOfMax);
        System.out.println("The hours spent on the topic is " + max);

        System.out.println("the topic has minimum hours is " + nameOfMin);
        System.out.println("The hours spent on the topic is " + min);


    }

}

/*
Given the following maps that contains the main java topics that we have covered during the course and
hours that have been spent on them;

Map<String,Double> unit1 = new LinkedHashMap<>();
unit1.put("Print Statements", 6.0);
unit1.put("Escape Sequences", 3.0);
unit1.put("Primitives", 6.0);
unit1.put("Operators", 9.0);
unit1.put("If statements ", 9.0);
unit1.put("Switch statement", 4.0);
unit1.put("Scanner", 6.0);

Map<String,Double> unit2 = new LinkedHashMap<>();
unit2.put("String Manipulation", 12.0);
unit2.put("Loops", 17.5);
unit2.put("Branching Statements", 1.5);
unit2.put("Arrays", 14.5);
unit2.put("Custom Methods ", 16.5);
unit2.put("Wrapper Classes", 3.0);
unit2.put("Scanner", 6.0);

Map<String,Double> unit3 = new LinkedHashMap<>();
unit3.put("Custom Method", 16.5);
unit3.put("Wrapper Classes", 3.0);
unit3.put("ArrayList", 11.5);

Map<String,Double> unit4 = new LinkedHashMap<>();
unit4.put("Custom Class", 23.5);
unit4.put("Access Modifiers", 2.5);

Map<String,Double> unit5 = new LinkedHashMap<>();
unit5.put("OOP Encapsulation", 4.5);
unit5.put("OOP Inheritance ", 13.5);
unit5.put("Final KeyWord", 2.5);
unit5.put("Exceptions", 8.5);

Map<String,Double> unit6 = new LinkedHashMap<>();
unit6.put("OOP Abstraction", 14.5);
unit6.put("OOP Polymorphism", 8.5);
unit6.put("Collection", 9.5);
unit6.put("Map", 7.5);

1.Display each Java Topic and its hours on the console;
2.Display the names of Java topics that we spent more than 7 hours;
3.Display the names of the java topics that we spent less than 3 hours;
4.Which Java topic has the maximum hours;
5.Which Java topic has minimum hours;




 */
