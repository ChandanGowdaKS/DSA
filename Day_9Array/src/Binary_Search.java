public class Binary_Search {

    public static int Binary_search(int number[], int key){
        int start = 0, end = number.length-1;

        while(start <=end){
            int mid = (start + end)/2;

            //comparision
            if(number[mid] == key){  // key found
                return mid;
            }
            if(number[mid] < key){   //right
                start = mid+1;
            }
            else{ // left
                    end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,8,22,26,44,57};
        int key = 44;
        int result = Binary_search(numbers,key);
        System.out.println("The index of given key is : "+result);
    }
}
