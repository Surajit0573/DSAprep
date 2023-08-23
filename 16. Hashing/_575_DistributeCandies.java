import java.util.*;
public class _575_DistributeCandies{

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            hs.add(candyType[i]);
        }
        if(candyType.length/2<=hs.size()){
            return candyType.length/2;
        }else{
           return  hs.size();
        }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}