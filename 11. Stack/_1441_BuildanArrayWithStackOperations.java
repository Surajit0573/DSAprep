import java.util.*;
public class _1441_BuildanArrayWithStackOperations{

    public List<String> buildArray(int[] target, int n) {
        List<String>ans=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n&&j<target.length;i++){
            if(i==target[j]){
                ans.add("Push");
                j++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}