// https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
// https://leetcode.com/problems/maximum-subarray/
package StriverDSA.three.two;

import java.util.Arrays;

import Common.io;

class Solution {
    public Solution() {
    }

    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;

    }

    public int[] printmaxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;

        int[] res;
        int start = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                startIndex = start;
                endIndex = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        res = Arrays.copyOfRange(nums, startIndex, endIndex + 1);
        return res;
    }
}

public class kadane {

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4}));
        io.displayArr(sc.printmaxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
}