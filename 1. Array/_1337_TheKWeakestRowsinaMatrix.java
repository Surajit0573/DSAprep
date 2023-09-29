import java.util.*;
public class _1337_TheKWeakestRowsinaMatrix{
    public static class pair implements Comparable<pair>{
        int idx;
        int one;
        pair(int idx,int one){
            this.idx=idx;
            this.one=one;
        }
        public int compareTo(pair p){
            if(this.one!=p.one){
                return this.one-p.one;
            }else{
                return this.idx-p.idx;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        pair[] p=new pair[mat.length];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            p[i]=new pair(i, count);
        }
        Arrays.sort(p);
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=p[i].idx;
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}