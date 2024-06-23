package StriverDSA.a2z_1.a2z_1_2;
/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

public class t {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i)
                    System.out.print("*");
                else if (j - n > n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i > j)
                    System.out.print("*");
                else if (j - n - 1 > n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
