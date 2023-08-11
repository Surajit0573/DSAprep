import java.util.*;
public class _322_Coin_Change{


    public int coinChange(int[] val, int w) {
        int n = val.length;
        int[][] dp = new int[n+1][w + 1];
        Arrays.fill(dp[0],w+1);
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                
                    int v=val[i-1];
                    if(v<=j){
                        int incval=1+dp[i][j-v];
                        int exval=dp[i-1][j]; 
                        dp[i][j]=Math.min(incval, exval);
                    }else{
                       dp[i][j]=dp[i-1][j];
                    }
               

            }
           
        }
        if(dp[n][w]==w+1){
            return -1;
        }
        return dp[n][w];
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}