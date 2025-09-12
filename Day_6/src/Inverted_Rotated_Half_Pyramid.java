public class Inverted_Rotated_Half_Pyramid {
    // 1st logic
    public static void pyramid(int n){
        // outer loop
        for (int i =1; i<=n; i++){
            // inner loop
            for(int j = n;j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*".repeat(i));
            System.out.println();
        }

    }

    public static void pyramid2(int n){
        // outer loop
        for (int i = 1; i<=n; i++){
            // inner loop
            for(int j = n; j>=1; j--){
                if(j<=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramid3(int n){
        for(int i =1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(4);
        pyramid2( 4);
        pyramid3(4);
    }
}
