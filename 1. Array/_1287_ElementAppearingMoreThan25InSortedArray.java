import java.util.*;
public class _1287_ElementAppearingMoreThan25InSortedArray{

    public int findSpecialInteger(int[] arr) {
        int f=arr.length/4;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(hm.get(arr[i])>f){
                return arr[i];
            }
        }
        return -1;

    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}