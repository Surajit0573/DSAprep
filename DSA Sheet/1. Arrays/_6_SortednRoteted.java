import java.util.*;

public class _6_SortednRoteted {

    public static int search(int[] nums, int target) {
        // find min
        int minidx = minSearch(nums);
        if (target <= nums[nums.length - 1]) {
            return search(nums, target, minidx, nums.length - 1);
        } else {
            return search(nums, target, 0, minidx - 1);
        }
    }

    public static int search(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[mid] > nums[right] && nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(search(nums,3));
        sc.close();
    }
}