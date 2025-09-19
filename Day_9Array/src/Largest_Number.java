// to find largest number in an array

public class Largest_Number {

    public static int largest(int number[]) {
        int temp = 0;
        for (int i = 0; i < number.length; i++) {
            if (temp <= number[i]) {
                temp = number[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int numbers[] = {5,1,6,78,9,2};
        int result = largest(numbers);
        System.out.println("The Largest number is: "+result);
    }
}
