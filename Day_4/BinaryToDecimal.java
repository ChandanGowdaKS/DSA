public class BinaryToDecimal {
    public static void BinaryTodecimal(int n) {
        int binum = n;
        int LD = 0;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            LD = (n % 10);
            n = n/10;
            dec = dec + (LD * (int) (Math.pow(2, pow)));
            pow += 1;
        }
        System.out.println("Decimal Number of " + binum + " = " + dec);
    }

    public static void main(String[] args) {
        BinaryTodecimal(101);



    }
}
