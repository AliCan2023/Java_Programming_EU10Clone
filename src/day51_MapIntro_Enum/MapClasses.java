package day51_MapIntro_Enum;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) { //// key never be duplicated but value can be;

        Map<Integer,String> hashMap= new HashMap<>();//More often used than the others;HashMap is the fastest performance among its fellows.
        hashMap.put(3,"Ali");//add elements; you cannot use putAll() to add all pairs unless you have one more Map;
        hashMap.put(10,"George");
        hashMap.put(20,"Jack");
        hashMap.put(40,"Jacob");
        hashMap.put(5,"Isabella");
        hashMap.put(5,"Hasan");
        hashMap.put(null,null); // excepts null value;
        hashMap.put(null,"ali");
        hashMap.put(null,"Batu"); // the key null only excepts the last inserted;
        //in this case the value "Isabella" is shoot out and assign the new value to key 5;
        // when the keys are duplicated the last inserted value assigned to the key;key CANNOT be duplicated;
        // Values can be duplicated in Map;
        //HashMap is uses less memory and fastest performance one;but the order of the pair is not guaranteed;

        System.out.println("hashMap = " + hashMap);
        
        
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10,"George"); //the order of the pair is always kept;
        linkedHashMap.put(20,"Jack");
        linkedHashMap.put(40,"Jacob");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(5,"Hasan");
        linkedHashMap.put(null,null); // excepts null value;
        linkedHashMap.put(null,"ali");
        
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap = new TreeMap<>();
        
        treeMap.put(10,"George"); //the order of the pair is the smaller key values first in order;
        treeMap.put(20,"Jack");
        treeMap.put(40,"Jacob");
        treeMap.put(5,"Isabella");
        treeMap.put(5,"Hasan");
        treeMap.put(30,null);//only key cannot be null;
       //treeMap.put(null,null); // does not excepts null value; internally key calls the value so cannot assign the null;
        //treeMap.put(null,"ali");// key cannot be null
        System.out.println("treeMap = " + treeMap);

        Map<Integer,String> hashTable = new Hashtable<>();
        
        hashTable.put(10,"George"); //the order of the pair is random;
        hashTable.put(20,"Jack");
        hashTable.put(40,"Jacob");
        hashTable.put(5,"Isabella");
        hashTable.put(5,"Hasan");
        //hashTable.put(130,null);
        // hashTable.put(null,null); both key and value cannot be null;

        System.out.println("hashTable = " + hashTable);


    }
}
