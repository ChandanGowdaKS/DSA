/*
Write a Java program to check if a number is a palindrome in Java? (121 is palindrome, 321 is not)
 */


public class Palindrome {
    public static int IsPalindrome(int a){
        int reversedNum = 0;
        while(a>0) {
            int LD = a % 10;
            reversedNum = reversedNum * 10 +LD;
            a /=10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        System.out.println(IsPalindrome(1245));
    }
}
