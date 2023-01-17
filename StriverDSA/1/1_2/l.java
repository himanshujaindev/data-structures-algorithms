/*
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
*/

public class l {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print(j + " ");
                else
                    System.out.print(" " + " ");
            }

            for (int j = 1; j <= n; j++) {
                if (n - j >= i)
                    System.out.print(" " + " ");

                else
                    System.out.print(n - j + 1 + " ");
            }

            System.out.println();
        }
    }
}
