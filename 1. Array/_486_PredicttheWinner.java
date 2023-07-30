import java.util.*;

public class _486_PredicttheWinner {

    public static boolean PredictTheWinner(int[] nums) {
        long p1 = 0;
        long p2 = 0;
        boolean first=true;
        for (int i = 0, j = nums.length-1; i <= j;) {
            int curr=0;
            if ((j - i) > 2) {
                if (nums[j - 1]+nums[i]>=nums[i+1]+nums[j]) {
                    curr= nums[i];
                    i++;
                }
                else{
                    curr= nums[j];
                    j--;
                }
               
            }else{
                 if(nums[i]>nums[j]){
                    curr=nums[i];
                    i++;
                }else{
                    curr=nums[j];
                    j--;
                }
            }

            if(first){
                p1+=curr;
                first=false;
                System.out.println("p1  :"+curr);
            }else{
                p2+=curr;
                first=true;
                System.out.println("p2  :"+curr);
            }

        }
        return p1 >= p2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] nums={3606449,6,5,9,452429,7,9580316,9857582,8514433,9,6,6614512,753594,5474165,4,2697293,8,7,1};
        System.out.println(PredictTheWinner(nums));
        sc.close();
    }
}