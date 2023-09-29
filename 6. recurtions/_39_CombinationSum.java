import java.util.*;
public class _39_CombinationSum{

    public static void recurtion(int[] c,int idx,int target,List<Integer>list,List<List<Integer>>ans){
        if(target==0){
            List<Integer>list2=new ArrayList<>(list);
            ans.add(list2);
            return;
        }
        for(int i=idx;i<c.length;i++){
            if(target-c[i]>=0){
                list.add(c[i]);
                recurtion(c,i, target-c[i],list,ans);
                list.remove(list.size()-1);
            }else{
                break;
            }
        }

    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        recurtion(candidates,0, target, list, ans);
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}