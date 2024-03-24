package BT7;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT7 - HashMap, Hashtable and Fail-Fast Iterator - Sort by Key - To Vinh Tien - 22521474.");
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "OOP");
        hashtable.put(55, "JAVA");
        hashtable.put(23, "HashMap");

        HashMap<Integer, String> hashMap = new HashMap<>(hashtable);

        System.out.println(STR."\nHashtable: \{hashtable}");
        System.out.println(STR."HashMap: \{hashMap}");

        Map<Integer, String> sortedHashtable = SortByKey.sortByKeys(hashtable);
        Map<Integer, String> sortedHashMap = SortByKey.sortByKeys(hashMap);

        System.out.println(STR."\nSorted Hashtable: \{sortedHashtable}");
        System.out.println(STR."Sorted HashMap: \{sortedHashMap}");
    }
}