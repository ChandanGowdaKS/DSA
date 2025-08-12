//*****
//*****
//*****
//*****

//public class Main {
//    public static void main(String[] args) {
//        for (int i=0;i<5;i++){
//            System.out.println("*".repeat(5));
//        }
//    }
//}

//1
//12
//123
//1234

//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i =1; i<=n;i++){
//            for(int j =1; j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//12345
//1234
//123
//12
//1

//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i =n; i>=1;i--){
//            for(int j = 1; j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

//public class Main {
//    public static void main(String[] args) {
//        int n= 5;
//        int num = 1;
//        for (int i=1;i<=n;i++){
//            for (int j=0;j<i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
//    }
//}

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                if (i+j % 2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
