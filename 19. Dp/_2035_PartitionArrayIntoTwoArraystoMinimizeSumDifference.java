import java.util.*;
public class _2035_PartitionArrayIntoTwoArraystoMinimizeSumDifference{

    public int minimumDifference(int[] nums) { //Time limit Exceed
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        return recurtion(nums,0,total,nums.length/2,0);
    }

    public static int recurtion(int[] num,int sum,int total,int n,int i){
       
        if(n==0){
            return Math.abs((total-sum)-sum);
        }
         if(i==num.length){
            return Integer.MAX_VALUE;
         }
        return Math.min(recurtion(num, sum+num[i],total, n-1,i+1),recurtion(num, sum,total, n,i+1));
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
sc.close();
}
}