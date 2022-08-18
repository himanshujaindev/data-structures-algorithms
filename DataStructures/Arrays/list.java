package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        int[] arr = {10,20,30};


        // Array to list - Traverse the arr and add elements to the list
        List<Integer> newList = new ArrayList<>();
        for(int elem: arr) {
            newList.add(elem);
        }
        

        // list to array
        Integer[] newArr = list.toArray(new Integer[list.size()]);


    }
}
