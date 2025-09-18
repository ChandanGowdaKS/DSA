public class Butterfly_Pattern {
    public static void butterfly(int n){
        for(int i =1; i<=n; i++){
            for(int z = 1; z<=i;z++){
                System.out.print("*");
            }
            for( int j = n*2; j>i*2;j--){
                System.out.print(" ");
            }
            for(int z = 1; z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int z = 1; z<=i;z++){
                System.out.print("*");
            }
            for( int j = n*2; j>i*2;j--){
                System.out.print(" ");
            }
            for(int z = 1; z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(9);
    }
}
