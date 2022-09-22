package Algorithms.Patterns;

/*

1
12
123
1234
12345

*/

public class c {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j <= i) {
                System.out.print(j + 1);
                j++;
            }

            while (j < 5) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }

    }
}
