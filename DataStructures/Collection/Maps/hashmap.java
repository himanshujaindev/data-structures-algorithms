package DataStructures.Collection.Maps;

import java.util.HashMap;
import java.util.Map;

import Common.io;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = io.readArr();

        // Freq of array elements
        Map<Integer, Integer> hm = new HashMap<>();

        for (int elem : arr) {
            // if (hm.containsKey(elem)) {
            // hm.put(elem, hm.get(elem) + 1);
            // } else {
            // hm.put(elem, 1);
            // }

            hm.put(elem, hm.getOrDefault(elem, 0) + 1);
        }

        System.out.print("Array = ");
        io.displayArr(arr);
        System.out.println("Hashmap = " + hm.toString());

        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}
