import java.util.*;

public class _4_MedianofTwoSortedArrays {

    public static int binaryscarch(int[] arr, int[] nums, int length) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            int left = length - (mid + 1);
            if ((left >= 0 && arr[mid] < nums[left])
                    && ((left > 0 && mid < arr.length - 1 && arr[mid + 1] > nums[left - 1])
                            || (mid == arr.length - 1))) {
                return mid;
            } else if (left >= 0 && arr[mid] > nums[left]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        boolean flag = true;
        if (length % 2 == 0) {
            length = length / 2 - 1;
        } else {
            flag = false;
            length = length / 2;
        }
        int mid = 0;
        if (nums1.length < nums2.length) {
            mid = binaryscarch(nums1, nums2, length);
            int left = length - mid;
            if (flag) {
                return (Math.max(nums1[mid], nums2[left]) + Math.min(nums1[mid + 1], nums2[left + 1])) / 2;
            } else {
                return Math.min(nums1[mid + 1], nums2[left + 1]);
            }
        } else {
            mid = binaryscarch(nums2, nums1, length);
            int left = length - mid;
            if (flag) {
                return (Math.max(nums1[mid], nums2[left]) + Math.min(nums1[mid + 1], nums2[left + 1])) / 2;
            } else {
                return Math.min(nums1[mid + 1], nums2[left + 1]);
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}