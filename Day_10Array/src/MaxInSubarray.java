public class MaxInSubarray {
    public static void MaxSubarray(int numbers[]){
        int CurrentSum =0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length;i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                CurrentSum = 0;
                for(int k = start; k<=end; k++){
                    CurrentSum += numbers[k];
                }
                System.out.println(CurrentSum);
                if(MaxSum < CurrentSum){
                    MaxSum =CurrentSum;
                }
            }
            System.out.println();
        }
        System.out.println("MAX Sum is : "+MaxSum);
    }

    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
        MaxSubarray(numbers);
    }
}
