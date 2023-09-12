 import java.util.*;
public class _31_NextPermutation{
public void nextPermutation(int[] nums) {
        //find pivot
        int p;
        for(p=nums.length-2;p>=0;p--){
            if(nums[p+1]>nums[p]){
                break;
            }
        }
        //find smallest greater number
        int i;
          for(i=nums.length-1;i>p;i--){
            if(nums[i]>nums[p]){
                break;
            }
            }
        
        //swap
        int temp=nums[i];
        nums[i]=nums[p];
        nums[p]=temp;
        //reverse
        int start=p+1;
        int end=nums.length-1;
        while(start<end){
              int tem=nums[start];
        nums[start]=nums[end];
        nums[end]=tem;
        start++;
        end--;
        }

}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}

