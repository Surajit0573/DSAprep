import java.util.*;
public class _2482_DifferenceBetweenOnesandZerosinRowandColumn{

    public int[][] onesMinusZeros(int[][] grid) {
        int[] rowzero=new int[grid.length];
        int[] rowone=new int[grid.length];
        int[] colzero=new int[grid[0].length];
        int[] colone=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    rowzero[i]++;
                    colzero[j]++;
                }
                if(grid[i][j]==1){
                    rowone[i]++;
                    colone[j]++;
                }
            }
        }
        int[][] ans=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=rowone[i] + colone[j] - rowzero[i] - colzero[j];
            }
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}