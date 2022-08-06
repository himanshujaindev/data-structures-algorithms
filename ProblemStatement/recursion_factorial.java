import java.util.Scanner;

class recursion_factorial {

    public int factorial(int n) {

        // base condition
        if(n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1); // subproblem // stack memory
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num = ");
        int n = sc.nextInt();

        recursion_factorial f = new recursion_factorial();
        int res = f.factorial(n);

        // int res = factorial(n);  // if use static method
        System.out.println("Factorial = " + res);
    }
    
}