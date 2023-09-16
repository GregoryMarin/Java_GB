package Sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Methods {
    static Integer[] createSet(int min, int max, int capacity){
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    static double unic(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        return percent;
    }
}
