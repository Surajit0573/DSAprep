import java.util.*;
public class _75_SortColors{

    public static void swap(int i,int low,int[] nums){
        int temp=nums[low];
        nums[low]=nums[i];
        nums[i]=temp;
    }

    public void sortColors(int[] nums) {
   int low=0;
   int high=nums.length-1;
   for(int i=low;i<=high;){
    if(nums[i]==0){
        swap(i,low,nums);
        low++;
    }
    else if(nums[i]==1){
        i++;
    }
    else{
       swap(i,high,nums);
        high--;
    }
   }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}