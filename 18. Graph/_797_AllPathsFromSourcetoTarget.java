import java.util.*;
public class _797_AllPathsFromSourcetoTarget{

    public static void path(int[][] graph,List<List<Integer>> ans,int curr,List<Integer> ansi){
        ansi.add(curr);
        if(curr==graph.length-1){
            List<Integer> b=new ArrayList<>(ansi);
            ans.add(b);
            return;
        }
        for(int i=0;i<graph[curr].length;i++){
            path(graph, ans,graph[curr][i], ansi);
            ansi.remove(ansi.size()-1);
        }
        
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ansi=new ArrayList<>();
        path(graph, ans, 0,ansi);
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[][] graph={{1,2},{3},{3},{}};
System.out.println(allPathsSourceTarget(graph));
sc.close();
}
}