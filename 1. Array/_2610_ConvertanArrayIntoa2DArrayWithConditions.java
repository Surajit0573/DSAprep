import java.util.*;
public class _2610_ConvertanArrayIntoa2DArrayWithConditions{

    public List<List<Integer>> findMatrix(int[] nums) {
       List<Integer>arr=new ArrayList<>();
       
       for(int i=0;i<nums.length;i++){
        arr.add(nums[i]);
       }
       List<List<Integer>>ans=new ArrayList<>();
       while(arr.size()>0){
        List<Integer>temp=new ArrayList<>();
         HashSet<Integer>hs=new HashSet<>();
         for(int i=0;i<arr.size();i++){
            if(hs.contains(arr.get(i))){
                temp.add(arr.get(i));
                hs.add(arr.get(i));
                arr.remove(i);
                i--;
            }
         }
         ans.add(new ArrayList<>(temp));
       }
       return ans;
       
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}