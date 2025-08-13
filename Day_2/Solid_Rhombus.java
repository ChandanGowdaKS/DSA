/*  * * * * *
   * * * * *
  * * * * *
 * * * * *
* * * * *

 */

public class Solid_Rhombus {
    public static void main(String[] args) {
        int n =15;
        for(int i =1; i<=n; i++){
            // space
            for(int j = n; j>i; j--){
                System.out.print(" ");
            }
            // starts
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
