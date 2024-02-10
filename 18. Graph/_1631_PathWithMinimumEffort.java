import java.lang.reflect.Array;
import java.util.*;

public class _1631_PathWithMinimumEffort {

    public static class node implements Comparable<node>{
        int row;
        int col;
        int wt;

        node(int row, int col, int wt) {
            this.row = row;
            this.col = col;
            this.wt = wt;
        }
        public int compareTo(node n){
            return this.wt-n.wt;
        }
    }

    // public static void create(int[][] heights){
    // ArrayList<node>[]graph=new ArrayList[heights]
    // for(int i=0;i<heights.length;i++){
    // for(int j=0;j<heights[0].length;j++){

    // }
    // }
    // }
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int[][] effort = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        effort[0][0] = 0;
        for(int i=0;i<effort.length;i++){
            Arrays.fill(effort[i],Integer.MAX_VALUE);
        }
        PriorityQueue<node>pq=new PriorityQueue<>();
        pq.add(new node(0,0,0));
        while(!pq.isEmpty()){
            node curr=pq.remove();
            int r=curr.row;
            int c=curr.col;
            int w=curr.wt;
            vis[r][c]=true;
            if(r-1>=0&&!vis[r-1][c]){
                int e=Math.abs(heights[r][c]-heights[r-1][c]);
                effort[r-1][c]=Math.min( effort[r-1][c],Math.max(w,e));
                pq.add(new node(r-1, c,effort[r-1][c]));
            }
             if(c-1>=0&&!vis[r][c-1]){
                int e=Math.abs(heights[r][c]-heights[r][c-1]);
                effort[r][c-1]=Math.min( effort[r][c-1],Math.max(w,e));
                pq.add(new node(r, c-1,effort[r][c-1]));
            }
             if(r+1<n&&!vis[r+1][c]){
                int e=Math.abs(heights[r][c]-heights[r+1][c]);
                effort[r+1][c]=Math.min( effort[r+1][c],Math.max(w,e));
                pq.add(new node(r+1, c,effort[r+1][c]));
            }
             if(c+1<m&&!vis[r][c+1]){
                int e=Math.abs(heights[r][c]-heights[r][c+1]);
                effort[r][c+1]=Math.min( effort[r][c+1],Math.max(w,e));
                pq.add(new node(r, c+1,effort[r][c+1]));
            }
        }
        return effort[n-1][m-1];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}