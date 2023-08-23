import java.util.*;

public class _307_RangeSumQuery {
    class NumArray {

        int[] ST;
        int[] nums;

        public NumArray(int[] nums) {
            this.nums=nums;
            this.ST = new int[4 * nums.length];
            impletation(nums, 0, 0, nums.length-1);
            for(int i=0;i<ST.length;i++){
                System.out.print(ST[i]+" ");
            }
            System.out.println();
        }

        public int impletation(int[] nums, int i, int start, int end) {
            if (start == end) {
                return ST[i] = nums[start];
            }
            int mid = (start + end) / 2;
            return ST[i] = impletation(nums, 2 * i + 1, start, mid) + impletation(nums, 2 * i + 2, mid + 1, end);
        }

    public void update(int index, int val) {
        int diff=val-nums[index];
        nums[index]=val;
        updateutil(diff,0,0,nums.length-1,index);
        for(int i=0;i<ST.length;i++){
                System.out.print(ST[i]+" ");
            }
            System.out.println();

    }
    public void updateutil(int diff,int i,int start,int end,int index){
        if(index<start||index>end){
            return;
        }
          ST[i]+=diff;
        if(start==end){
             return;
        }
        int mid=(start+end)/2;
       updateutil(diff,2*i+1, start,mid, index);
       updateutil(diff,2*i+2,mid+1, end, index);
    }

        public int sumRange(int left, int right) {
            return sumRangeUtil(left, right,0,nums.length-1,0);
        }
        public int sumRangeUtil(int left,int right,int start,int end,int i){
            //case 1 - non-Overlapping
            if(left>end||right<start){
                return 0;
            }
            //case 2  - Completely Overlapping
            if(start>=left&&end<=right){
                return ST[i];
            }
              int mid=(start+end)/2;
              return sumRangeUtil(left, right, start,mid,2*i+1)+sumRangeUtil(left, right,mid+1, end,2*i+2);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}