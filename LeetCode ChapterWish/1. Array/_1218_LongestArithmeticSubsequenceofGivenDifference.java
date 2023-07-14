import java.util.*;

public class _1218_LongestArithmeticSubsequenceofGivenDifference {

    public static int longestSubsequence(int[] arr, int difference) {
        int[] copy=arr.clone();
        Arrays.sort(copy);
        int maxlen = 1;
        for (int k = 0; k < arr.length; k++) {
            int len = 1;
            int i=k;
            while(i<arr.length){
                boolean flag=true;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] - arr[i] == difference) {
                        len++;
                        i=j;
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,5,7,8,5,3,4,2,1};
        System.out.println(longestSubsequence(arr,-2));
        sc.close();
    }
}