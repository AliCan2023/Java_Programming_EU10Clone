package day51_MapIntro_Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_InterviewQuestions {

    public static void main(String[] args) {
        String str = "bbbbcccaaaaa";// in order to keep the order of characters better to use LinkedHashMap;
        //             bca
        //             435
        //Collection.frequency();
        String [] array = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        for (String each : array) { //characters of str
            int frequency = Collections.frequency(Arrays.asList(array),each);// frequency:accepts one collection type and one object;
            result.put(each, frequency);
        }
        System.out.println("result = " + result);
    }

}
/*
Write a program that can return the frequency of characters;
Note: MUST use Map;

Ex: str = "bbbbcccaaaaa";

output:{b= 4, a=5 , c =3 }
 */

