import java.util.*;
public class _300_LongestIncreasingSubsequence{

     // Longest incresing Sub - Tabulization
     public static int lengthOfLIS(int[] arr1) {
        int n = arr1.length;

        // create a unique incresing array
        TreeSet<Integer> hs = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr1[i]);
        }
        int[] arr2 = new int[hs.size()];
        int x = 0;
        for (Integer k : hs) {
            arr2[x] = k;
            x++;
        }
        int m = arr2.length;
         int[][]dp=new int[n+1][m+1];
         for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
        if(arr1[i-1]==arr2[j-1]){
        dp[i][j]=1+dp[i-1][j-1];
        }else{
        dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        }
        }

        }
        return dp[n][m];

    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}