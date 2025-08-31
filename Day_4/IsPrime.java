public class IsPrime {
    public static boolean Isprime(int n){
        boolean isprime = true;
        for (int i =2; i<n;i++){
            if (n % i == 0){
                isprime = false;
                return isprime;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(Isprime(4));
    }
}
