package QuickCode;

public class leetcode {

    public static int concatenatedBinary(int n) {
        long res = 0;
        long MOD = (long) Math.pow(10, 9) + 7;
        for (int i = 1; i <= n; i++) {
            int no_digits = Integer.toBinaryString(i).length();
            res = (long) (res * Math.pow(2, no_digits) + i) % MOD;
        }

        return (int) res;
    }

    public static void main(String[] args) {

        int res = concatenatedBinary(12);
        System.out.println(res);
    }
}
