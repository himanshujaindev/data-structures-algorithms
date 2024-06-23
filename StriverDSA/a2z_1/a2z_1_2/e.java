package StriverDSA.a2z_1.a2z_1_2;
/*

*****
**** 
***  
**   
* 

*/

public class e {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j < 5 - i) {
                System.out.print("*");
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
