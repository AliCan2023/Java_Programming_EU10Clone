package day51_MapIntro_Enum;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {

//       /* String[] group1 = {"Ali Can", "Nur", "Ali Dag", "Mehmet", "Nur", "Fatih", "Erdem", "Omer", "Reyhan", "Izel"};
//        String[] group12 = {"Irfan", "Mihman", "Konak", "Mustafa", "Kasim", "Ayhan", "Nevzat"};
//        String[] group24 = {"Alim", "Metehan", "Fatma", "Aycha", "Bekir", "Onur", "Mustafa"};
//        String[] group18 = {"Yakup", "Patime", "Maria", "Kerem", "Nijat", "Juret", "Mia"};
//        String[] group15 = {"Batu", "Xahrazat", "Elyar", "Aycha", "Tata", "Miray", "Muhtar"};

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Ali Can", "Nur", "Ali Dag", "Mehmet", "Nur", "Fatih", "Erdem", "Omer", "Reyhan", "Izel"));
        ArrayList<String> group12 = new ArrayList<>(Arrays.asList("Irfan", "Mihman", "Konak", "Mustafa", "Kasim", "Ayhan", "Nevzat"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Alim", "Metehan", "Fatma", "Aycha", "Bekir", "Onur", "Mustafa"));
        ArrayList<String> group18 = new ArrayList<>(Arrays.asList("Yakup", "Patime", "Maria", "Kerem", "Nijat", "Juret", "Mia"));
        ArrayList<String> group15 = new ArrayList<>(Arrays.asList("Batu", "Xahrazat", "Elyar", "Aycha", "Tata", "Miray", "Muhtar"));


        //create a map where you can store names along with the ID as a pair;

        // Map<Integer, String[]> groups = new TreeMap<>();// TreeMap sorts the key in ascending orders;
         /* groups.put(1, group1);
        groups.put(12, group12);
        groups.put(24, group24);
        groups.put(18, group18);
        groups.put(15, group15);

        System.out.println(Arrays.toString(groups.get(1)));// it would be better to use ArrayList not to call toString Method;

        */
        Map<Integer, ArrayList<String>> groups = new TreeMap<>();// TreeMap sorts the key in ascending orders;
        groups.put(1, group1);
        groups.put(12, group12);
        groups.put(24, group24);
        groups.put(18, group18);
        groups.put(15, group15);

        System.out.println(groups);

//        for (String each : groups.get(1)) {
//            System.out.println(each);
//        }
        System.out.println(groups.get(12).get(3));
        System.out.println(groups.get(12).get(3));

        System.out.println("-----------------------------------------------------------------");

        // print out each of every Ss Names from the groups line by line;
        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);

            }

        }

    }
}
