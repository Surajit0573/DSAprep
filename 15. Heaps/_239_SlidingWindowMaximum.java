import java.util.*;

public class _239_SlidingWindowMaximum {
   
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max=new int[nums.length-(k-1)];
      Deque<Integer>dq=new LinkedList<>();//store index
      for(int i=0;i<nums.length;i++){
        //keep in range
        if(!dq.isEmpty()&&dq.peek()<i-k+1){
            dq.removeFirst();
        }
        while(!dq.isEmpty()&&nums[i]>nums[dq.getLast()]){
            dq.removeLast();
        }
        dq.add(i);
        if(i>=k-1){
            max[i-(k-1)]=nums[dq.peek()];
        }
      }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}