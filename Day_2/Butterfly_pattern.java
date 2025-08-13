// Print Butterfly pattern
/*      *        *
        **      **
        ***    ***
        ****  ****
        **********
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *

 */

public class Butterfly_pattern {
    public static void main(String[] args) {
        int n = 15;
        // upper half
        for (int i= 1; i<=n; i++){
            // 1st half *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 *(n-i);
            for(int j= 1; j<= spaces; j++){
                System.out.print(" ");
            }
            // 2nd Half *
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower Half
        for(int i = n; i>=1; i--){
            // 1st half *
            for (int j =1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2 * (n-i);
            for(int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            // 2nd half *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
