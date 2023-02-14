package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOfMap {

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

        Map<String,String>[] array = new Map[5];// 5 maps i have got to store above all;
        // how should i store those maps into array? by indexing;
        array[0]=ScrumTeam1;
        array[1]=ScrumTeam2;
        array[2]=ScrumTeam3;
        array[3]=ScrumTeam4;
        array[4]=ScrumTeam5;

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println(array.length);

        // when you have a list of maps you had better not use ArrayOfMap but listOfMaps;


    }


}
