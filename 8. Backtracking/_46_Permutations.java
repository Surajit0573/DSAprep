import java.util.*;

public class _46_Permutations {

    public static List<List<Integer>> backtrack(ArrayList<Integer> nums, List<Integer> list, List<List<Integer>> ans,
            int size) {
        if (list.size() == size) {
            List<Integer> list2 = new ArrayList<>(list);
            ans.add(list2);
            return ans;
        }
        for (int i = 0; i < nums.size(); i++) {
            int curr=nums.remove(i);
            list.add(curr);
            backtrack(nums, list, ans, size);
            list.remove(list.size() - 1);
            if(nums.size()==0){
            nums.add(curr);
            }else{
                nums.add(i,curr);
            }
        }
        return ans;
    }

    public static List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            num.add(nums[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        return backtrack(num, list, ans, nums.length);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 1, 2, 3 };
        System.out.println(permute(nums));
        sc.close();
    }
}