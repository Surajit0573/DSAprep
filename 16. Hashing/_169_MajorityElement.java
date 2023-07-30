import java.util.*;

public class _169_MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
            if (hm.get(nums[i]) > (nums.length / 2)) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}