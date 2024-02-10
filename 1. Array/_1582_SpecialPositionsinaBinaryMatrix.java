import java.util.*;
public class _1582_SpecialPositionsinaBinaryMatrix{

    public int numSpecial(int[][] mat) {
        // boolean[] col=new boolean[mat[0].length];
        // boolean[] row=new boolean[mat.length];
         int count=0;
         for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                if(mat[i][j]==1){
                  
                    boolean flag=true;
                    for(int x=0;x<mat.length;x++){
                        if(x!=i&&mat[x][j]==1){
                            flag=false;
                            break;
                        }
                    }
                    for(int x=0;x<mat[0].length;x++){
                        if(x!=j&&mat[i][x]==1){
                            flag=false;
                            break;
                        }
                    }
                    if(flag==false){
                        break;
                    }else{
                        count++;
                    }
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
