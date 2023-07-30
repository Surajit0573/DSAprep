import java.util.*;
public class _673_NumberofLongestIncreasingSubsequence{
    
    public static class pair implements Comparable<pair>{
        int val;
        int level;
        pair(int v,int l){
            this.val=v;
            this.level=l;
        }
        public int compareTo(pair p){
            return this.level-p.level;
        }
    }

     public static int findNumberOfLIS(int[] nums) {
      ArrayList<pair> p=new ArrayList<>();
      p.add(new pair(nums[0],0));
      for(int i=1;i<nums.length;i++){
        boolean flag=false;
        int level=0;
        for(int j=p.size()-1;j>=0;j--){
            pair curr=p.get(j);
            if(flag&&level==curr.level&&curr.val<nums[i]){
                p.add(new pair(nums[i], curr.level+1));
            }
            if(!flag&&curr.val<nums[i]){
                p.add(new pair(nums[i], curr.level+1));
                level=curr.level;
                flag=true;
            }
        }
        if(!flag){
            p.add(new pair(nums[i], 0));
        }
        Collections.sort(p);
      }
      int le=p.get(p.size()-1).level;
      int ans=0;
      for(int i=p.size()-1;i>=0;i--){
        //System.out.println(p.get(i).val+" "+p.get(i).level);
        if(le==p.get(i).level){
            ans++;
        }
      }


        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] nums={84,-48,-33,-34,-52,72,75,-12,72,-45};
System.out.println(findNumberOfLIS(nums));
sc.close();
}
}