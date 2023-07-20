import java.util.*;
public class _997_FindtheTownJudge{
  
    public static int findJudge(int n, int[][] t) {
       boolean[] releted=new boolean[n];
       Arrays.fill(releted,false);
       int[] count=new int[n];
       for(int i=0;i<t.length;i++){
        releted[t[i][0]-1]=true;
        count[t[i][1]-1]++;
       }
       for(int i=0;i<n;i++){
        if(count[i]==n-1&&releted[i]==false){
            return i+1;
        }
       }
        return -1;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[][] nums={{1,3},{1,4},{2,3},{2,4},{4,3}};
System.out.println( findJudge(4,nums));
sc.close();
}
}