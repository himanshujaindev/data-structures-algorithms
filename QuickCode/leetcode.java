package QuickCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode {

    public static int findLength(int[] nums1, int[] nums2) {
        // Same as Longest Commen Substring

        // Compare all prefix of str1 with all prefix of str2 => Store common suffix
        // => Longest common suffix => LCS

        // dp(i)(j) = dp(i-1)(j-1) + 1 ... if str1[i] = str2[j]
        // dp(i)(j) = 0 ... if str1[i] != str2[j]

        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int res = 0;
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                if (dp[i][j] > res) {
                    res = dp[i][j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 2, 1 };
        int[] arr2 = { 3, 2, 1, 4, 7 };
        int res = findLength(arr1, arr2);
        System.out.println(res);
    }
}
