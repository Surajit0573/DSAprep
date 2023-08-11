import java.util.*;
public class _81_SearchinRotatedSortedArray2{

    public static boolean   search(int[] nums, int target) {
        //min will have index of minimum element of nums 
        int min = minSearch(nums); 
        if(nums[min]==target){
            return true;
        }
        //find in sorted left 
        if(nums[min] <= target && target <= nums[nums.length-1]){ 
            return search(nums,min,nums.length-1,target); 
        } 
            //find in sorted right 
            else { return search(nums,0,min,target); 
            } 
        }


        //binary search to find target in left to right boundary 

        public static boolean    search(int[] nums,int left,int right,int target){ 
            int l = left; int    r  = right;
            // System.out.println(left+" "+right); 
            while(l <= r){ int mid = l + (r - l)/2; 
                if(nums[mid] ==   target){ 
                    return true; 
                } else if(nums[mid] > target){
                     r = mid-1; 
                    } else{ 
                        l = mid+1; 
                    } 
                } return false; 
            }


            //smallest element index

            public static int minSearch(int[] nums){ 
                int left = 0; 
                int right = nums.length-1;
                while(left < right){
                    int mid = left + (right - left)/2; 
                    if(mid >  0  &&   nums[mid-1]    >  nums[mid]){ 
                        return mid; 
                    } else if(nums[left] <= nums[mid] && nums[mid] >= nums[right])
                    { 
                        left = mid+1; 
                    } else{ 
                        right = mid-1; 
                    } 
                } 
                return left;
            }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}