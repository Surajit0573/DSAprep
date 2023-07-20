import java.util.*;
public class _1557_MinimumNumberofVerticestoReachAllNodes{

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        //find the nodes with in order = 0
        //edges = [from,to]
        int[] inorder=new int[n];
        List<Integer> ans=new ArrayList<>();
        Arrays.fill(inorder,0);
        for(int i=0;i<edges.size();i++){
            inorder[edges.get(i).get(1)]++;
        }
        for(int i=0;i<n;i++){
            if(inorder[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}