package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        //write a program that can fins the unique character of a string;

        String str = "abbbbbcdddfffffg"; //a=1,c=1,g=1; Turn this String into Collection type;
        String[] arr = str.split("");

        //keep the order of the result that  we use the object of LinkedHashMap;
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if (frequency==1){
                result.put(each,1);
            }
        }
        System.out.println(result);


    }
}
