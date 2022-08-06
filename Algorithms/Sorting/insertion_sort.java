package Algorithms.Sorting;
import Algorithms.io;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = io.read();
        System.out.print("Before Sort = ");
        io.display(arr);


        // Algo

        System.out.print("After Sort = ");
        io.display(arr);
    }
}
