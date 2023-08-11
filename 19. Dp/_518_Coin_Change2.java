import java.util.*;
public class _518_Coin_Change2{

    public int change(int sum, int[] coins) {
        int n=coins.length;
        int[][]dp=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                    if(coins[i-1]<=j){
                        dp[i][j]=dp[i][j-coins[i-1]]+ dp[i-1][j];
                    }else{
                       dp[i][j]=dp[i-1][j];
                    }

            }
            
        }
        return dp[n][sum];
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}
