package DataStructures.Maps;

import java.util.HashMap;

import Common.io;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = io.read();

        // Freq of array elements
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int elem: arr) {
            if(hm.containsKey(elem)) {
                hm.put(elem, hm.get(elem) + 1);
            }
            else {
                hm.put(elem, 1);
            }
        }

        System.out.print("Array = ");
        io.display(arr);
        System.out.println("Hashmap = " + hm.toString());
    }
}
