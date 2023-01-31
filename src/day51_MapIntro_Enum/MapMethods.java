package day51_MapIntro_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score;

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygul", 95);
        students.put("Ali", 100);
        students.put("Elyar", 100);
        students.put("Patime", 100);
        students.put("Peri", 100);
        students.put("Mariam", 100);
        students.put("Batu", 80);

        students.put("Batu", 90);//key cannot be duplicated in any Map;
        students.put("Batu", 95);
        students.put("Batu", 93);

        System.out.println("students = " + students);
        System.out.println(students.size());

        //display the score of Batu;
        System.out.println(students.get("Batu"));

        //replace(): replace Ali's score to 90;
        students.replace("Ali", 90);
        System.out.println("students = " + students);

        //remove(): once you remove the key the value also removed; decreases the size of the map;
        students.remove("Patime");
        students.size();
        System.out.println(students.size());
        System.out.println(students.remove("Mariam", 100));//returns boolean if it's removed or not;

        //containsKey():

        boolean r1 = students.containsKey("Mustafa");
        System.out.println(r1);//false koz we don't have key "Mustafa";

        boolean r2 = students.containsKey("Batu");
        System.out.println(r2);

        //containsValue():
        boolean r3 = students.containsValue(100);
        System.out.println(r3);
        boolean r4 = students.containsValue(88);
        System.out.println("r4 = " + r4);

        //isEmpty(); if there is zero pair in the map;

        System.out.println("students.isEmpty() = " + students.isEmpty());

        System.out.println("--------------------------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2);// new object created, it cannot be equal to the other one;
        System.out.println("map1.equals(map2) = " + map1.equals(map2));// true

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);

    }
}
