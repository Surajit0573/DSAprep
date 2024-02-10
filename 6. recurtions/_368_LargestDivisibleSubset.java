import java.util.*;

public class _368_LargestDivisibleSubset {

    class Solution {
        static HashMap<Integer, ArrayList<Integer>> hm;

        public static ArrayList<Integer> recursion(int[] nums, int idx, int prev) {
            for (int i = idx; i < nums.length; i++) {
                if (prev!=-1&&nums[i] % prev == 0) {
                    if (hm.containsKey(nums[i])) {
                        return hm.get(nums[i]);
                    } else {
                        ArrayList<Integer> curr = new ArrayList<>();
                        curr.add(nums[i]);
                        curr.addAll(recursion(nums, i + 1, nums[i]));
                        hm.put(nums[i], curr);
                        return curr;
                    }
                }
                else if(!hm.containsKey(nums[i])){
                    ArrayList<Integer> curr = new ArrayList<>();
                        curr.add(nums[i]);
                        curr.addAll(recursion(nums, i + 1, nums[i]));
                        hm.put(nums[i], curr);
                        return new ArrayList<>();
                }

            }
            return new ArrayList<>();
        }

        public List<Integer> largestDivisibleSubset(int[] nums) {
            Arrays.sort(nums);
            hm=new HashMap<>();
            recursion(nums, 0, -1);
            Set<Integer>key=hm.keySet();
            List<Integer>ans=new ArrayList<>();
            for(Integer k:key){

                if(ans.size()<hm.get(k).size()){
                    ans=hm.get(k);
                }
            }
            return ans;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}