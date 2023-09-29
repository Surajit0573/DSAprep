import java.util.*;

public class _1658_MinimumOperationstoReduceXtoZero {

    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int[] prefix=new int[nums.length];
        HashMap<Integer,Integer>hs=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i]=sum;
            hs.put(sum,i);
        }
        int target = sum - x;
        if (target == 0) {
            return nums.length;
        }
        if (target < 0) {
            return -1;
        }
        for(int i=nums.length-1;i>=0;i--){
            int diff=prefix[i]-target;
            if(hs.containsKey(diff)){
                return nums.length-(i-hs.get(diff));
            }
        }
        return -1;
        

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}