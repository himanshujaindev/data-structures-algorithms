package Common;

import java.util.Arrays;
import java.util.Scanner;

public class io {
    public static int[] read() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
