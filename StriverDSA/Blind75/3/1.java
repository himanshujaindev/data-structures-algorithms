
class Solution {

    public int climbStairs(int n) {
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 2;

        if (n == 1) {
            return dp[0];
        }

        for (int i = 3; i <= n; i++) {
            int temp = dp[1];
            dp[1] += dp[0];
            dp[0] = temp;
        }
        return dp[1];
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.climbStairs(3));
    }
}
