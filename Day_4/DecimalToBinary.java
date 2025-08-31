public class DecimalToBinary {
    public static void decimaltobinary(int n){
        int pow = 0;
        int binary = 0;
        while (n>0){
            int remainder = n%2;
            binary = binary + (remainder * (int)Math.pow(10,pow));
            pow++;
            n /=2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        decimaltobinary(12);
    }
}
