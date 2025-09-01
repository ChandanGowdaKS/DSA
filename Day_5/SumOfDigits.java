public class SumOfDigits {
    public static int sumnofdigits(int a){

        int sum =0;
        while(a>0) {
            int LD = a % 10;
            sum +=LD;
            a /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumnofdigits(1224));
    }
}
