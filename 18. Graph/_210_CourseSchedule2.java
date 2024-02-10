import java.util.*;
public class _210_CourseSchedule2{

    public static class Edge{
        int s;
        int d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }

    //DFS - Util
    public static boolean dfs(ArrayList<Edge>[] graph,Stack<Integer>s,boolean[] vis,int curr,boolean[] st){
        vis[curr]=true;
        st[curr]=true; 
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(st[e.d]==true){
                return true;
            }
            if(!vis[e.d]){
                if(dfs(graph, s, vis, e.d,st)){
                    return true;
                }
            }
        }
        st[curr]=false;
        s.push(curr);
        return false;
    }
    public static int[] findOrder(int n, int[][] p) {
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
        Stack<Integer>s=new Stack<>();
        //DFS
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(dfs(graph,s,vis,i,stack)){
                    int[] a={};
                   return a;
                }
            }
        }
        int x=0;
        int[] ans=new int[n];
        while(!s.isEmpty()){
            ans[x]=s.pop();
            x++;
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[][] p={{0,1},{1,2}};
int[] ans=findOrder(3, p);
for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");
}
sc.close();
}
}