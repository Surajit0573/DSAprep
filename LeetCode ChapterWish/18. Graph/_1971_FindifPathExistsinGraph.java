import java.util.*;
public class  _1971_FindifPathExistsinGraph{
    public static class Edges{
        int u;
        int v;
        Edges(int u,int v){
            this.u=u;
            this.v=v;
        }
    }
    public static boolean path(ArrayList<Edges>[] graph,int curr,int dest,boolean[] vis){
        if(curr==dest){
            return true;
        }
        if(!vis[curr]){
            vis[curr]=true;
           for(int i=0;i<graph[curr].size();i++){
            Edges e=graph[curr].get(i);
            if(path(graph, e.v, dest, vis)){
                return true;
            }
           }
            
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        @SuppressWarnings("unchecked")
        ArrayList<Edges>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(new Edges(edges[i][0],edges[i][1]));
            graph[edges[i][1]].add(new Edges(edges[i][1],edges[i][0]));
        }
        boolean[] vis=new boolean[n];
        return path(graph, source, destination, vis);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}