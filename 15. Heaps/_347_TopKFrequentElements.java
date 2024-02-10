import java.util.*;
public class _347_TopKFrequentElements{

    public static class pair implements Comparable<pair>{
        int key;
        int value;
        pair(int key,int value){
            this.key=key;
            this.value=value;
        }

        public int compareTo(pair p){
            return p.value-this.value;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<pair>pq=new PriorityQueue<>();
        Set<Integer> key=hm.keySet();
        for(Integer keys:key){
            pq.add(new pair(keys,hm.get(keys)));
        }
        int[]ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.remove().key;
        }
        return ans;

    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}