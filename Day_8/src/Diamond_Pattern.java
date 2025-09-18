public class Diamond_Pattern {
    public static void Diamond(int n){
        // outer loop
        for(int i =1; i<=n; i++){
            // spaces
            for(int j =1;j<=n-i; j++){
                System.out.print(" ");
            }
            // starts
            for(int k =1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i =n; i>=1; i--){
            // spaces
            for(int j =1;j<=n-i; j++){
                System.out.print(" ");
            }
            // starts
            for(int l =1; l<=2*i-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamond(4);
    }
}
