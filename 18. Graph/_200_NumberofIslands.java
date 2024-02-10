import java.util.*;
public class _200_NumberofIslands{

    public static void visit(int i,int j,char[][]grid,boolean[][]vis){
        vis[i][j]=true;
        if(i-1>=0&&!vis[i-1][j]&&grid[i-1][j]=='1'){
            visit(i-1, j, grid, vis);
        }
         if(j-1>=0&&!vis[i][j-1]&&grid[i][j-1]=='1'){
            visit(i, j-1, grid, vis);
        }
         if(i+1<grid.length&&!vis[i+1][j]&&grid[i+1][j]=='1'){
            visit(i+1, j, grid, vis);
        }
         if(j+1<grid[0].length&&!vis[i][j+1]&&grid[i][j+1]=='1'){
            visit(i, j+1, grid, vis);
        }
    }
    public int numIslands(char[][] grid) {
        boolean[][]vis=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j]&&grid[i][j]=='1'){
                    count++;
                    visit(i,j,grid,vis);
                }
            }
        }
        return count;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}