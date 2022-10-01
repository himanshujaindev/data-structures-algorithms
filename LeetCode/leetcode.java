package LeetCode;

import java.util.List;

public class leetcode {

    public int numDecodings(String s) {

        /*
         * prev, curr
         * 0,0 - Invalid
         * 0,X - Invalid
         * X,0 - X = 1 or X = 2
         * X,Y - X = 1 or (X = 2 and 0 <= Y <= 6)
         */

        int n = s.length();
        int[] dp = new int[n + 1]; // Ex: s = X231011

        if (s.charAt(0) == '0')
            return 0;

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) > '0') { // curr char
                dp[i] = dp[i - 1];
            }

            if ((s.charAt(i - 2) == '1') ||
                    (s.charAt(i - 2) == '2' && (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '6'))) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        leetcode lt = new leetcode();

        int a = 1;
        List<Integer> res = lt.fn(a);
        System.out.println(res);
    }
}
