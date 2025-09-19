public class Linear_search {
    public static int linear_search(int numbers[], int key){
        for(int i =0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,22,54,36,78,98};
        int key = 36;
        int result = linear_search(numbers,key);
        if(result == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found : "+key);
        }

    }

}
