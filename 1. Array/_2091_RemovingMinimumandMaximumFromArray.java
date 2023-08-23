import java.util.*;

public class _2091_RemovingMinimumandMaximumFromArray {

    public int minimumDeletions(int[] nums) {
         
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minindex = 0;
        int maxindex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxindex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minindex = i;
            }
        }
       
        int minleft = minindex + 1;
           int maxleft = maxindex + 1;
        int minright = nums.length -minleft +1;
        int maxright = nums.length - maxleft+1;
     
           
            int a= Math.max(maxleft,minleft);
            int b=Math.max(maxright,minright);
        int c= Math.min(maxright,maxleft)+Math.min(minleft,minright);
        return Math.min(c,Math.min(a,b));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}