import java.util.*;
public class _207_CourseSchedule{
    public static class Edge{
        int s;
        int d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }

    //DFS - Util
    public static boolean dfs(ArrayList<Edge>[] graph,boolean[] s,boolean[] vis,int curr){
        vis[curr]=true;
        s[curr]=true; 
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(s[e.d]==true){
                return true;
            }
            if(!vis[e.d]){
                if(dfs(graph, s, vis, e.d)){
                    return true;
                }
            }
        }
       s[curr]=false;
       return false;
    }

    public static boolean canFinish(int n, int[][] p) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph =new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<p.length;i++){
            graph[p[i][1]].add(new Edge(p[i][1],p[i][0]));
        }
        boolean[] vis=new boolean[n];
        boolean[] stack=new boolean[n];
        //DFS
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(dfs(graph,stack,vis,i)){
                    return false;
                }
            }
        }
        return true;
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[][] p={{0,10},{3,18},{5,5},{6,11},{11,14},{13,1},{15,1},{17,4}};
System.out.println(canFinish(20,p));
sc.close();
}
}