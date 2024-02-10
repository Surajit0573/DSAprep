import java.util.*;
public class _896_MonotonicArray{

    public static boolean inc(int[]nums,int i){
        for(int j=i;j<nums.length;j++){
            if(nums[j]<nums[j-1]){
                return false;
            }
        }
        return true;
    }

     public static boolean dec(int[]nums,int i){
        for(int j=i;j<nums.length;j++){
            if(nums[j]>nums[j-1]){
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
       //inc or dec
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            return inc(nums,i);
        } else if(nums[i]<nums[i-1]){
            return dec(nums,i);
        }
       }
       return true;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}