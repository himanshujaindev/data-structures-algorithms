package Common;

import java.util.Arrays;
import java.util.Scanner;

public class io {

    // Int
    public static int readInt() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num = ");
        int num = sc.nextInt();

        return num;
    }

    public static void displayInt(int num) {
        System.out.println(num);
    }

    // Array
    public static int[] readArr() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void displayArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
