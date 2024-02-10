import java.util.*;

public class _34_FindFirstandLastPositionofElementinSortedArray {

    public static int idx(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int mid = (start + end)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
               end=mid-1;
            }
        }
        if(nums[start]==target){
            return start;
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int idx1,idx2;
        idx1=idx2=idx(nums, target);
        if(idx1==-1){
        int[]arr={-1,-1};
        return arr;
        }
        while(nums[idx1]==target){
            idx1--;
        }
        while(nums[idx2]==target){
            idx2++;
        }
        int[] ans = { idx1+1, idx2-1 };
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}