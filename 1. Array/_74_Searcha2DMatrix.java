import java.util.*;
public class _74_Searcha2DMatrix{
    
   
//Function
public boolean searchMatrix(int[][] matrix, int target) {
    int r=matrix.length;
    int c=matrix[0].length;
    if(matrix[0][0]==target||matrix[r-1][c-1]==target){
        return true;
      }
        int start=0;
        int end=r*c-1;
        while(start<end){
            int mid=(start+end)/2;
            int x=mid/c;
            int y=mid%c;
            if(matrix[x][y]==target){
                return true;
            }
            if(matrix[x][y]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return false;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}