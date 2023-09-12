import java.util.*;
public class _62_UniquePaths{

    public int uniquePaths(int m, int n) {
        int max=Math.max(m,n)-1;
        int min=Math.min(m,n)-1;
        double ans=1;
        int j=1;
        for(double i=max+1;i<=max+min;i++){
            ans=ans*i;
            ans=ans/j;
            j++;
             
        }
        return (int)ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}