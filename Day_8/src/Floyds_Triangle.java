public class Floyds_Triangle {
    public static void triangle(int n){
        // outer loop\
        int count = 1;
        for(int i = 1; i<=n; i++){
            //inner loop
            for (int j= 1; j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
