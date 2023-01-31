package day51_MapIntro_Enum;

import java.util.*;

public class MapIteration {

    //The rest of the three methods are very important;
    // but in the future we often use put(),get() and entrySet() methods;
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aypatem", 95);
        students.put("Ali", 99);
        students.put("Elyar", 79);
        students.put("Gulten", 70);
        students.put("Peri", 100);
        students.put("Mariam", 100);
        students.put("Batu", 85);
        students.put("Mustafa", 80);
        //students.put("Mustafa", 90); key cannot be duplicated;

        //keySet(): return type is a set of string; koz it returns all the keys in the map; Set is the collection of unit elements; and keys are unique;

//        Set<String> sKeys = students.keySet();
//        System.out.println("studentsKeys = " + sKeys);
//        // so in this case we can use loop;
//        for (String eachKey : sKeys) {
//            // System.out.println(eachKey + " : " + students.get(eachKey));// since we get iterated eachKey then we can get the value to the key;
//            students.replace(eachKey, students.get(eachKey) + 5);// increase each value by 5;once you get the key everything gets easier;
//        }
        System.out.println("students = " + students);
        // remove all the ss score is less than 90;
        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if (eachValue <= 85) {
                System.out.println(eachKey);//Mustafa,Batu;
            }

//            if (eachValue <= 85){ cannot use this condition directly;
//                students.remove(eachKey);
//            }
        }
        System.out.println("---------------------------------");

        Map<String, Integer> earlyBirds = new HashMap<>();// to be eligible score >=90
        Map<String, Integer> lazyBirds = new HashMap<>();//score <90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                lazyBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("lazyBirds = " + lazyBirds);

        // if you want to deal with the map and wants the key only use Set;
        Set<String> keys = students.keySet();

        System.out.println("-----------------------------------------");
        // you can iterate the map by the value;

        Collection<Integer> scores = students.values();// you can convert this into List;
        System.out.println("scores = " + scores);

        List<Integer> scores1 = new ArrayList<>(students.values());
        System.out.println("scores1 = " + scores1);

        for (Integer value : students.values()) {
            System.out.println("value = " + value);

        }
        System.out.println("----------------------------------------------");
        // maxScore;
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer eachScore : students.values()) {

            if (eachScore > maxScore) {
                maxScore = eachScore;
            }
            if (eachScore < minScore) {
                minScore = eachScore;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("----------------------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println(max);
        System.out.println(min);

        System.out.println("----------------------------------------------------");
        // how many Ss have the score of 95 or greater;

        int count = 0;

        for (Integer eachScore : students.values()) {
            if (eachScore >= 95) {
                count++;
            }
        }
        System.out.println(count + " students have score of 95 0r greater.");

//        or we can use keySet() method to do so;
////        for (String eachKey : students.keySet()) {// even iterating the keys can do this task but it is better to do task using iteration of the values;
////            Integer eachScore = students.get(eachKey);// in this way you write a line more code;
////            if (eachScore >=95){
////                count++;
////            }
////        }
////        System.out.println(count + " students have score of 95 0r greater.");
        System.out.println("----------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);// returns a set of key and values;
            //System.out.println(entry.getKey());// only returns key which is names here;
            System.out.println(entry.getKey() + " : " + entry.getValue());// in this case returns both key and value;

        }



    }
}
