import java.util.*;
public class _1636_SortArraybyIncreasingFrequency{
    public static class pair implements Comparable<pair>{
        int val;
        int fq;
        pair(int val,int fq){
            this.val=val;
            this.fq=fq;
        }
        public int compareTo(pair p){
            if(p.fq==this.fq){
                return p.val-this.val;
            }
            return this.fq-p.fq;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<pair>list=new ArrayList<>();
        Set<Integer>keys=hm.keySet();
        for(Integer k:keys){
            list.add(new pair(k,hm.get(k)));
        }
        Collections.sort(list);
        int[] ans=new int[nums.length];
        int x=0;
        for(int i=0;i<list.size();i++){
            while(list.get(i).fq-->0){
                ans[x]=list.get(i).val;
                x++;
            }
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}