import java.util.*;
public class _56_MergeIntervals{

    public int[][] merge(int[][] in) {
        Arrays.sort(in,Comparator.comparingDouble(o->o[0]));
        int[][] ans=new int[in.length][2];
        int k=0;
             ans[0][0]=in[0][0];
                ans[0][1]=in[0][1];
        for(int i=1;i<in.length;i++){
            if(in[i][0]<=ans[k][1]){
                if( ans[k][1]<in[i][1]){
                ans[k][1]=in[i][1];
                }
            }else{
                k++;
                ans[k][0]=in[i][0];
                ans[k][1]=in[i][1];
            }
        }
        int[][] arr=new int[k+1][2];
        for(int i=0;i<=k;i++){
            arr[i][0]=ans[i][0];
             arr[i][1]=ans[i][1];
        }
        return arr;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}