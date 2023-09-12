import java.util.*;
public class _128_LongestConsecutiveSequence{

    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;        }
       HashSet<Integer>hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
       }
       int longest=1;
       int curr=1;
       for(Integer key:hs){
        if(!hs.contains(key-1)){
            curr=1;
            while(hs.contains(key+1)){
                key++;
                curr++;
            }
            longest=Math.max(longest,curr);
        }
       } 
       return longest;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}