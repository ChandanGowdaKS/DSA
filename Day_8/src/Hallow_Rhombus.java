public class Hallow_Rhombus {
    public static void Haloow(int n){
        for (int i =1; i<=n; i++){
            //spaces
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            if(i == 1 || i == n){
                for(int k = 1; k<=n; k++ ){
                    System.out.print("*");
                }
            }else{
                for(int l = 1; l<=n;l++){
                    if(l ==1 || l==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Haloow(5);
    }
}
