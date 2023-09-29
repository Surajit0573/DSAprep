import java.util.*;
public class _134_GasStation{

    public static class pair implements Comparable<pair>{
        int idx;
        int diff;
        pair(int idx,int diff){
            this.idx=idx;
            this.diff=diff;
        }
        public int compareTo(pair p){
            return p.diff-this.diff;
        }
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        pair[]p=new pair[gas.length];
        for(int i=0;i<gas.length;i++){
            p[i]=new pair(i,gas[i]-cost[i]);
        }
        Arrays.sort(p);
        for(int i=0;i<gas.length;i++){
            if(p[i].diff>=0){
            int length=gas.length;
            int j=p[i].idx;
            int curr=gas[p[i].idx];
            boolean flag=true;
            while(length-->0){
                curr=curr-cost[j];
                if(curr<0){
                    flag=false;
                    break;
                }
                curr=curr+gas[(j+1)%gas.length];
                 j=(j+1)%gas.length;
            }
            if(flag) return p[i].idx;
        }
        }
        return -1;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}