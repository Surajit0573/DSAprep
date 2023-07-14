import java.util.*;
public class _785_IsGraphBipartite{

    //bfs
    public static boolean BFS(int[][] graph,boolean[] vis,int[] color,int curr){
        Queue<Integer>q=new LinkedList<>();
        q.add(curr);
        while(!q.isEmpty()){
            int temp=q.remove();
            if(!vis[temp]){
                vis[temp]=true;
                int currcolor=color[temp];
                for(int i=0;i<graph[temp].length;i++){
                    int n=graph[temp][i];
                    if(color[n]==currcolor){
                        return false;
                    }
                    else{
                        if(currcolor==1){
                            color[n]=2;
                        }else{
                            color[n]=1;
                        }
                    }
                    q.add(n);
                }
            }
        }
        return true;
    }
    //coloring Algo
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                color[i]=1;
            if(BFS(graph,vis,color,i)==false){
                return false;
            }
            }
        }
        return true;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}
