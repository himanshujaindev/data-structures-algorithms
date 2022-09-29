package QuickCode;

import java.util.ArrayList;
import java.util.List;

public class leetcode {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while ((high - low) >= k) {
            if (Math.abs(x - arr[high]) < Math.abs(x - arr[low]))
                low++;
            else
                high--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 0, 0, 1, 3, 5, 6, 7, 8, 8 };
        List<Integer> res = findClosestElements(arr, 2, 2);
        System.out.println(res);
    }
}
