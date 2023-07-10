import java.util.*;
public class _35_SearchInsertPosition{

    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        int start=0;
        int end=nums.length-1;
        int mid=nums.length/2;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return start;
            }
        }
        if(nums[mid]<target){
            return mid+1;
        }
        return mid; 
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] nums={1,2,3,5,6,7,8,9};
System.out.println(searchInsert(nums,4));
sc.close();
}
}