import java.util.*;
public class  _45_JumpGame2 {

        
        public int jump(int[] nums) {
            int[]dp=new int[nums.length];
            dp[nums.length-1]=0;
            for(int i=nums.length-2;i>=0;i--){
                int min=Integer.MAX_VALUE;
                for(int j=1;j<=nums[i];j++){
                    min=Math.min(min,dp[i+j]);
                }
                if(min==Integer.MAX_VALUE){
                    dp[i]=min;
                }else{
                    dp[i]=min+1;
                }
            }
            return dp[0];
        }

        //BEST APPROCH
        
        // public int jump(int[] A) {
        //     int jumps = 0, curEnd = 0, curFarthest = 0;
        //     for (int i = 0; i < A.length - 1; i++) {
        //         curFarthest = Math.max(curFarthest, i + A[i]);
        //         if (i == curEnd) {
        //             jumps++;
        //             curEnd = curFarthest;
        //         }
        //     }
        //     return jumps;
        // }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}