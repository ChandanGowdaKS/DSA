public class Inverted_Half_Pyramid_with_Numbers {

    // my logic
    public static void Pyramid1(int n){
        // outer loop
        for(int i = n; i>=1; i--){
            // innner loop
            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // 2nd Logic
    public static void Pyramid2(int n){
        for (int i = 1; i<=n; i++){
            // inner loop
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Pyramid1(5);
        Pyramid2(5);
    }
}
