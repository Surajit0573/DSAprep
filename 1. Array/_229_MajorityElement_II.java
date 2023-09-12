import java.util.*;
public class _229_MajorityElement_II{
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
           int count=Integer.MIN_VALUE;
           int count2=Integer.MIN_VALUE;
        int ele=0;
        int ele2=0;
        for(int i=0;i<nums.length;i++){
            if(count==0&&ele2!=nums[i]){
                count=1;
                ele=nums[i];
            }
            else if(count2==0&&ele!=nums[i]){
                count2=1;
                ele2=nums[i];
            }
            else if(ele==nums[i]){
                count++;
            }
            else if(ele2==nums[i]){
                count2++;
            }else{
                count--;
                count2--;
            }
        }
        List<Integer>ls=new ArrayList<>();
        count = 0; count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) count++;
            if (nums[i] == ele2) count2++;
        }

        int mini = (int)(n / 3) + 1;
        if (count >= mini) ls.add(ele);
        if (count2 >= mini) ls.add(ele2);
        return ls; 
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}