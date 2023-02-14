package day52_Map_FunctionalInterface;

import java.util.*;

public class ListOfMapPractice1 {

    public static void main(String[] args) {

        Map<String, String> ScrumTeam1 = new LinkedHashMap<>();
        ScrumTeam1.put("Ali", "QA");
        ScrumTeam1.put("Batu", "SDET");
        ScrumTeam1.put("Ensar", "Dev");
        ScrumTeam1.put("Maria", "PO");
        ScrumTeam1.put("Mustaf", "SM");

        Map<String, String> ScrumTeam2 = new LinkedHashMap<>();
        ScrumTeam2.put("Peri", "QA");
        ScrumTeam2.put("Aycha", "PO");
        ScrumTeam2.put("Alexa", "QA");
        ScrumTeam2.put("Mariam", "SM");
        ScrumTeam2.put("Merhaba", "Dev");

        Map<String, String> ScrumTeam3 = new LinkedHashMap<>();
        ScrumTeam3.put("John", "QA");
        ScrumTeam3.put("Mustafa", "PO");
        ScrumTeam3.put("Irfan", "QA");
        ScrumTeam3.put("Mariam", "SM");
        ScrumTeam3.put("Muhtar", "Dev");

        Map<String, String> ScrumTeam4 = new LinkedHashMap<>();
        ScrumTeam4.put("Ali", "QA");
        ScrumTeam4.put("Aycha", "PO");
        ScrumTeam4.put("Nur", "QA");
        ScrumTeam4.put("Natasha", "SM");
        ScrumTeam4.put("Mariah", "Dev");

        Map<String, String> ScrumTeam5 = new LinkedHashMap<>();
        ScrumTeam5.put("Hicran", "Dev");
        ScrumTeam5.put("Doruk", "PO");
        ScrumTeam5.put("Haluk", "QA");
        ScrumTeam5.put("Zeynep", "SM");
        ScrumTeam5.put("Meral", "Dev");

        //create a data structure that contains all the maps above;
        // WE choose the collection type of list koz it preserves the order and has index number;

        //List<LinkedHashMap<String, String>> ScrumTeamList = new ArrayList<>();// only accepts String as the Key and String as the value;
        List<Map<String, String>> ScrumTeams = new ArrayList<>();// only accepts String as the Key and String as the value;
        ScrumTeams.add(ScrumTeam1);// reference type casting;
        ScrumTeams.add(ScrumTeam2);
        ScrumTeams.addAll(Arrays.asList(ScrumTeam3, ScrumTeam4, ScrumTeam5));
        //scrumTeams.addAll((Collection< extends LinkedHashMap<String,String>>) Arrays.asList((LinkedHashMap) scrumTeam1,(LinkedHashMap) scrumTeam2,(LinkedHashMap) scrumTeam3..)

        System.out.println(ScrumTeams);
        System.out.println(ScrumTeams.size());

        //print the names of all employees

        for (Map<String, String> eachScrumTeam : ScrumTeams) { //you can have access to each of the map now;using EntrySet method from tha map to iterate key and value;
            for (Map.Entry<String, String> eachPair : eachScrumTeam.entrySet()) {
                System.out.println(eachPair.getKey() + " : " + eachPair.getValue());

            }

        }
        System.out.println("------------------------------------------------");

        //1.2 Print the names of all scrum masters;
        // instead of iterating the map by the key we can iterate the map by entrySet;
        for (Map<String, String> eachScrumTeam : ScrumTeams) {
            /* for (String name : eachScrumTeam.keySet()) {
                if (eachScrumTeam.get(name).equals("SM")){
                    System.out.println(name + " :SM" );
                }
            }
             */
            // iterate the map by the pairs;
            for (Map.Entry<String, String> eachPair : eachScrumTeam.entrySet()) {
                if (eachPair.getValue().equals("SM")) {
                    System.out.println("SM: " + eachPair.getKey());
                }
            }
        }
        System.out.println("------------------------------------------------");

        //1.3 Print the names of all Developers;

        for (Map<String, String> eachScrumTeam : ScrumTeams) {

            // iterate the map by the pairs;
            for (Map.Entry<String, String> eachPair : eachScrumTeam.entrySet()) {
                if (eachPair.getValue().equalsIgnoreCase("DEV")) {
                    System.out.println("Developer: " + eachPair.getKey());
                }
            }
        }


    }
}
