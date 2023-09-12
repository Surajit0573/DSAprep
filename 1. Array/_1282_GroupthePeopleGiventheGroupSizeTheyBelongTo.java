import java.util.*;
public class _1282_GroupthePeopleGiventheGroupSizeTheyBelongTo{
    public static class pair implements Comparable<pair>{
        int idx;
        int size;
        pair(int idx,int size){
            this.idx=idx;
            this.size=size;
        }
        public int compareTo(pair p){
            return this.size-p.size;
        }
    }
    public List<List<Integer>> groupThePeople(int[] gs) {
        pair[] p=new pair[gs.length];
        for(int i=0;i<gs.length;i++){
            p[i]=new pair(i,gs[i]);
        }
        Arrays.sort(p);
        
        List<List<Integer>>ans=new ArrayList<>();
        int count=0;
        List<Integer>temp=new ArrayList<>();
        for(int i=0;i<p.length;i++){
            if(count==0){
                count = p[i].size;
                if(temp.size()>0){
                    ans.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
            temp.add(p[i].idx);
            count--;
        }
        if(temp.size()>0){
                    ans.add(new ArrayList<>(temp));
                    temp.clear();
                }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}