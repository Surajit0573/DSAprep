import java.util.*;
public class _70_Climbing_Stairs{
    

    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        if(n==2||n==1){
            return n;
        }
        dp[2]=2;
        dp[1]=1;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}