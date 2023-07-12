import java.util.*;
public class _802_FindEventualSafeStates{

    //DFS
    public static boolean chack(int[][] graph,int curr,boolean[] vis,boolean[] safe){
        if(graph[curr].length==0){
            safe[curr]=true;
            return true;
        }
        if(vis[curr]){
            if(safe[curr]){
                return true;
            }else{
                return false;
            }
        }else{
            vis[curr]=true;
        }
        for(int i=0;i<graph[curr].length;i++){
           if(!chack(graph,graph[curr][i],vis,safe)){
            return false;
           }
        }
        safe[curr]=true;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[graph.length];
        boolean[] safe=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
                if(chack(graph,i,vis,safe)){
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
