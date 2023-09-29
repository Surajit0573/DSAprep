import java.util.*;
public class _51_N_Queens{


    public static class pos{
        int x;
        int y;
        pos(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void nq(int n,int idx,ArrayList<pos>arr,List<List<String>>ans,List<String>curr){
       if(idx==n){
         List<String>curr2=new ArrayList<>(curr);
         ans.add(curr2);
         return;
       }
        String s="";
        for(int i=0;i<n;i++){
            if(isSafe(idx,i,arr)){
                s=s+"Q";
                arr.add(new pos(idx, i));
            }else{
                s=s+".";
            }
        }
        curr.add(s);
        nq(n, idx+1, arr, ans, curr);
        arr.remove(arr.size()-1);
        curr.remove(curr.size());
    }

    public static boolean isSafe(int i,int j,ArrayList<pos>arr){
        for(int k=0;k<arr.size();k++){
            if(i==arr.get(k).x||j==arr.get(k).y){
                return false;
            }
            if(Math.abs(i-arr.get(k).x)==Math.abs(j-arr.get(k).y)){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        ArrayList<pos>arr=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();
        List<String>curr=new ArrayList<>();
        nq(n, n, arr, ans, curr);
        return ans;

    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
sc.close();
}
}