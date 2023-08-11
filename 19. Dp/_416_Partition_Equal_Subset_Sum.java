import java.util.*;
public class _416_Partition_Equal_Subset_Sum{

    //Recrsive
public static boolean equalSubset(int[] num,int n,int sum1,int sum2){
  if(n==num.length){
    return sum1==sum2;
  }
  return equalSubset(num, n+1, sum1+num[n], sum2)||equalSubset(num, n+1, sum1, sum2+num[n]);

}

//Target Sum -Tabulation
public static boolean canPartition(int[] nums) {
    int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        boolean[][]dp=new boolean[nums.length+1][sum+1];
        for(int i=0;i<nums.length+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<nums.length+1;i++){
            for(int j=1;j<sum+1;j++){
                //include
                if(nums[i-1]<=j&&dp[i-1][j-nums[i-1]]){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]){
                    dp[i][j]=true;
                }
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
        return dp[nums.length][sum];
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] nums={1,5,11,5};
System.out.println(canPartition(nums));
sc.close();
}
}