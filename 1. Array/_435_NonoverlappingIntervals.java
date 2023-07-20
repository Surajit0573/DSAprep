import java.util.*;
public class _435_NonoverlappingIntervals{

    public static class pair implements Comparable<pair>{
        int x;
        int y;
        pair(int y,int x){
            this.x=x;
            this.y=y;
        }
        public int compareTo(pair p){
            if(this.x==p.x){
                return this.y-p.y;
            }
            return this.x-p.x;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
         ArrayList<pair> a=new ArrayList<>();
         for(int i=0;i<intervals.length;i++){
            a.add(new pair(intervals[i][0],intervals[i][1]));
         }
         Collections.sort(a);
         int count=0;
         for(int i=1;i<a.size();i++){
            pair p=a.get(i);
            pair prev=a.get(i-1);
            if(p.y<prev.x){
                a.remove(i);
                count++;
                i--;
            }
         }
        return count;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}