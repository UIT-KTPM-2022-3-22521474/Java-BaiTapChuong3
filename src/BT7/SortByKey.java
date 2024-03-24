package BT7;

import java.util.Map;
import java.util.TreeMap;

public class SortByKey {
    public static <K extends Comparable<K>, V> Map<K, V> sortByKeys(Map<K, V> map) {
        return new TreeMap<>(map);
    }
}