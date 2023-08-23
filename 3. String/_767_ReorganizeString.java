import java.lang.reflect.Array;
import java.util.*;
public class _767_ReorganizeString{
    public static class pair implements Comparable<pair>{
        int val;
        int idx;
        pair(int idx,int val){
            this.val=val;
            this.idx=idx;
        }
        public int compareTo(pair p){
            return this.val-p.val;
        }
    }
    public String reorganizeString(String s) {
        pair[] f=new pair[26];
       for(int i=0;i<26;i++){
        f[i]=new pair(i,0);
       }
        int max=0;
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a'].val++;
         max=Math.max(max, f[s.charAt(i)-'a'].val);
        }
        if(max-(s.length()-max)>1){
            return "";
        }
       
        String ans="";
         Arrays.sort(f);
        while(f[25].val>0){
             
       ans+=(char)(f[25].idx+'a');
       if(f[24].val>0){
       ans+=(char)('a'+f[24].idx);
       }
       f[25].val--;
       f[24].val--;
       Arrays.sort(f);
    }
     return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}