package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NestedMapPractice {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new TreeMap<>();// employee ID & jobTitle
        map1.put(3, "SDET");
        map1.put(7, "Dev");
        map1.put(9, "SM");
        map1.put(11, "PO");
        map1.put(15, "BA");

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Shawn", 110000);
        map2.put("Maria", 120000);
        map2.put("Mustafa", 100000);
        map2.put("Batu", 130000);
        map2.put("Ali", 150000);

        Map<Map<Integer, String>, Map<String, Integer>> mapOfMap = new LinkedHashMap<>();
        // Map Objects consumes a lot of memories in Java;so nestedMap aggregates memory consumption so that avoid to use MapOfMap;
        mapOfMap.put(map1, map2);
        // First get the names and the jobTitles; For Nested Map you sue Nested for;

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) {
            for (Map.Entry<Integer, String> entry : mapMapEntry.getKey().entrySet()) {//map1
                System.out.println(entry.getValue());
            }
            for (Map.Entry<String, Integer> entry : mapMapEntry.getValue().entrySet()) {//map2
                System.out.println(entry.getKey());

            }
        }

        System.out.println("-------------------------------------------------");
        // get the value of mapOfMap and get the salary of a specific person;
        System.out.println("Ali's salary is: " + mapOfMap.get(map1).get("Ali"));
    }
}
/*
   I want
   ID  JobTitle  Name      Salary
   3   SDET      SHAWN      110000
   ...
   to make this happen we need nested Map;
 */
