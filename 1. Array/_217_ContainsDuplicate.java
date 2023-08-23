import java.util.*;
public class _217_ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}