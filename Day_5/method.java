
/*Write a method named isEven that accepts an int argument. The method should return
true if the argument is even or false otherwise.
Also write a program to test your method. */


public class method {
    public static boolean isEven(int a){
        if (a %2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        if(isEven(5)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
