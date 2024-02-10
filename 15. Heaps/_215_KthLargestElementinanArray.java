import java.util.*;

import javax.print.attribute.standard.PrintQuality;
public class _215_KthLargestElementinanArray{
//Function

public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        
        }
        for(int i=1;i<k;i++){
            
            pq.remove();
        }
        return pq.remove();
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}