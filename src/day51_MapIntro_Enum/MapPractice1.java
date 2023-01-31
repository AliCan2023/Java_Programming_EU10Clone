package day51_MapIntro_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ali", "M");
        employeeMap.put("Batu", "M");
        employeeMap.put("Elyar", "M");
        employeeMap.put("Mustafa", "M");
        employeeMap.put("Maria", "F");
        employeeMap.put("Peri", "F");
        employeeMap.put("Jane", "F");
        employeeMap.put("Isabella", "F");
        employeeMap.put("Ferdinand", "M");
        employeeMap.put("Tarik", "M");
        employeeMap.put("Fatma", "F");
        employeeMap.put("Tom", "M");
        employeeMap.put("Aycha", "F");

        // update "M" to "Male" and "F" to "Female";
        /*for (String eachKey : employeeMap.keySet()) {
            if (employeeMap.get(eachKey).equalsIgnoreCase("m")) {
                employeeMap.replace(eachKey, "Male");
            }
            if (employeeMap.get(eachKey).equalsIgnoreCase("F")) {
                employeeMap.replace(eachKey, "Female");
            }
        }
        System.out.println("employeeMap = " + employeeMap);

         */
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("m")) {
                entry.setValue("Male");//this method is a bit easier than the one below;
                //employeeMap.replace(entry.getKey(),"Male");
            }
            if (entry.getValue().equalsIgnoreCase("f")) {
                entry.setValue("Female");//this method is a bit easier than the one below;
                //employeeMap.replace(entry.getKey(),"Female");
            }
        }

            //System.out.println("entry: " + entry);
            System.out.println("employeeMap = " + employeeMap);

            System.out.println("---------------------------------------------------");

            //2. Display the names of all female employees;

            for (Map.Entry<String, String> pair : employeeMap.entrySet()) {
                String eachKey = pair.getKey();
                String eachValue = pair.getValue();

                if (eachValue.equals("Female")) {
                    System.out.println(eachKey);
                }
            }


        }
    }
