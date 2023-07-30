import java.util.*;
public class _349_IntersectionofTwoArrays{



    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer>hs2=new HashSet<>();
          for(int i=0;i<nums2.length;i++){
           if(hs.contains(nums2[i])){
            hs2.add(nums2[i]);
           }
        }
        int[] ans=new int[hs2.size()];
        int k=0;
        for(Integer i:hs2){
            ans[k]=i;
            k++;
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}