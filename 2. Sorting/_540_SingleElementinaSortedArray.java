import java.util.*;

public class _540_SingleElementinaSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(((mid!=0&&nums[mid]!=nums[mid-1])||mid==0)&&((mid!=nums.length-1&&nums[mid]!=nums[mid+1])||mid==nums.length-1)){
                return nums[mid];
            }
            int idx=mid+1;
            if(idx%2==0){
                if(idx==nums.length||nums[idx-1]!=nums[idx]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(idx==1||nums[idx-1]!=nums[idx-2]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return nums[start];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}