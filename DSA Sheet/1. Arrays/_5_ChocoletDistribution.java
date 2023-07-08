import java.util.*;
public class _5_ChocoletDistribution{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int m=sc.nextInt();
Arrays.sort(a);
int min=Integer.MAX_VALUE;
for(int i=m-1;i<n;i++){
    if(a[i]-a[i+1-m]>min){
        break;
    }
min=Math.min(min,a[i]-a[i+1-m]);
}
System.out.println(min);
sc.close();
}
}