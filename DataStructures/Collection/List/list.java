package DataStructures.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        int[] arr = { 10, 20, 30 };

        // Array to list - Traverse the arr and add elements to the list
        List<Integer> newList = new ArrayList<>();
        for (int elem : arr) {
            newList.add(elem);
        }

        // list to array
        Integer[] newArr = list.toArray(new Integer[list.size()]);

        // int[]

        int[] arrInt = new int[5];
        for (int i = 0; i < 5; i++) {
            arrInt[i] = i;
        }

        // Sort a list

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(2);

        System.out.println(list1.toString());
        list1.sort(null); // Ascending
        // list1.sort(Comparator.reverseOrder()); // Descending
        System.out.println(list1.toString());

        System.out.println("Max = " + Collections.max(list1, null));
    }
}
