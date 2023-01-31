package day51_MapIntro_Enum;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPracticeSeveralEmployeeMaxSalary {
    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 135000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Ali", 135000);
        map.put("Steven", 135000);

//        int maxSalary = Integer.MIN_VALUE;
//
//        for (Integer eachValue : map.values()) {
//
//            if (eachValue > maxSalary) {
//                maxSalary = eachValue;
//            }
//        }
        int maxSalary = Collections.max(map.values());// if you are allowed to use Collections then this one is easier to get this job done;
        System.out.println("Max salary is : " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSalary) {
                System.out.println(pair.getKey());
            }
        }
    }
}
