import java.util.Arrays;

public class str {

    public static void main(String[] args) {

        String []A = {"flower", "flow", "flight"};
        longestCommonPrefix(A);
    }

        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            int i =0,j=0;
            // int store =0;
            StringBuilder store=new StringBuilder();
            String first = strs[0];
            String last = strs[strs.length-1];
            while(first.charAt(i) == last.charAt(j) && i<j || j<i){
                i++;j++;
                store.append(first.charAt(i));
            }
            String result = store.toString();
            return result;
        }
    }


