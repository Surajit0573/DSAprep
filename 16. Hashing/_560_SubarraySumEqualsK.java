import java.util.*;
public class _560_SubarraySumEqualsK{

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        hm.put(0,1);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(hm.containsKey(sum-k)){
                ans=ans+hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
       
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}