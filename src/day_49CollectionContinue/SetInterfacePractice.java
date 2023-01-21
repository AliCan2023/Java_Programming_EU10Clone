package day_49CollectionContinue;

import java.util.*;

public class SetInterfacePractice {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();// list all elements;
        list.addAll(Arrays.asList(10, 200, 300, 50, 88));
        list.addAll(Arrays.asList(10, 200, 300, 50, 88));
        list.addAll(Arrays.asList(10, 200, 300, 50, 88));
        list.addAll(Arrays.asList(10, 200, 300, 50, 88));
        list.addAll(Arrays.asList(10, 200, 300, 50, 88));
        list.addAll(Arrays.asList(null, null, null));
        System.out.println(list);
        System.out.println(list.get(4));

        Set<Integer> hashSet = new HashSet<>();// elements order random and no duplicated elements;
        hashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        hashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        hashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        hashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        hashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println(hashSet);
        //System.out.println(hashSet.get(4).);no index number in Set;


        Set<Integer> linkedHashSet = new LinkedHashSet<>();// No repetition here but elements stored in order;
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println(linkedHashSet);


        Set<Integer> treeSet = new TreeSet<>();
       treeSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        treeSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        treeSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        treeSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        treeSet.addAll(Arrays.asList(10, 200, 300, 50, 88));
        //treeSet.addAll(Arrays.asList(null, null, null));//TreeSet does not accept the Null value

        System.out.println(treeSet);
    }


}
