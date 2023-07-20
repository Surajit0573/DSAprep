import java.util.*;
public class _743_NetworkDelayTime{
    public static class Edge {
        int s;
        int d;
        int w;
        Edge(int s,int d,int w){
            this.s=s;
            this.w=w;
            this.d=d;
        }
    }

    public static class pair implements Comparable<pair>{
        int n;
        int path;
        pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        public int compareTo(pair p){
            return this.path-p.path;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[n+1];
        for(int i=1;i<n+1;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<times.length;i++){
            graph[times[i][0]].add(new Edge(times[i][0],times[i][1],times[i][2]));
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean[] vis=new boolean[n+1];
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        dist[0]=0;
        pq.add(new pair(k,0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    dist[e.d]=Math.min(dist[e.s]+e.w,dist[e.d]);
                    pq.add(new pair(e.d,dist[e.d]));
                }
            }
        }
        Arrays.sort(dist);
        int ans=dist[n];
        if(ans==Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}