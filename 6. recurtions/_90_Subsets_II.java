import java.util.*;
public class _90_Subsets_II{

    public static void subset(int[] nums,int i,ArrayList<Integer>arr, List<List<Integer>>hs){
        if(i==nums.length){
            ArrayList<Integer>curr=new ArrayList<>(arr);
            hs.add(curr);
            return;
        }
       for(int j=i;j<nums.length;j++){
        if(j!=i&&nums[j]==nums[j-1]){
            continue;
        }
        arr.add(nums[j]);
        subset(nums, i+1, arr, hs);
        arr.remove(arr.size()-1);
       }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>>ans=new ArrayList<>();
            ArrayList<Integer>arr=new ArrayList<>();
            subset(nums, 0,arr, ans);
            return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}