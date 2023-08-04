import java.util.*;
public class _77_Combinations{

    public static List<List<Integer>> backtrack(int n,int k,List<Integer> list,List<List<Integer>>ans,int curr){
        if(k==0){
            List<Integer> list2=new ArrayList<>(list);
            ans.add(list2);
        }
        for(int i=curr;i<=n;i++){
            list.add(i);
            backtrack(n, k-1, list,ans,curr+1);
            list.remove(list.size()-1);
            curr++;
        }
        return ans;
    }

    public static  List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>list =new ArrayList<>();
        return backtrack(n, k, list, ans,1);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(combine(1, 1));
sc.close();
}
}