import java.util.*;

public class _15_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2;) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                    k--;
                    while (nums[k] == nums[k + 1] && j < k) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                } else {
                    k--;
                    while (nums[k] == nums[k + 1] && j < k) {
                        k--;
                    }
                }
            }

        }
        return ans;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}