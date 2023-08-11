import java.util.*;
public class _198_House_Robber{

    public int rob(int[] nums) {
        int[]dp =new int[nums.length+1];
        dp[1]=nums[0];
        dp[0]=0;
        if(nums.length==1){
            return dp[1];
        }
        for(int i=2;i<nums.length+1;i++){
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[nums.length];
    }
    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}