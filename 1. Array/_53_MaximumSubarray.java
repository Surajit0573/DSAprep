import java.util.*;
public class _53_MaximumSubarray{
    public int maxSubArray(int[] nums) {
        int maxsum=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(curr<0){
                curr=0;
            }
            maxsum=Math.max(curr,maxsum);
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]<0){
            maxsum=nums[nums.length-1];
        }
        return maxsum;
        
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}