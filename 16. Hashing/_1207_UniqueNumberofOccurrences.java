import java.util.*;
public class _1207_UniqueNumberofOccurrences{

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>hs=new HashSet<>();
        Set<Integer>keys=hm.keySet();
        for(Integer k:keys){
            if(hs.contains(hm.get(k))){
                return false;
            }else{
                hs.add(hm.get(k));
            }
        }
        return true;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}