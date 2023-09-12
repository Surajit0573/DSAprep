import java.util.*;
public class _48_RotateImage{

    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
          for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix.length;i++){
                int t=matrix.length-i-1;
                int temp=matrix[j][i];
                matrix[j][i]=matrix[j][t];
                matrix[j][t]=temp;
            }
        }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}