import java.util.*;
public class _268_missing_number{

public static int missingNumber(int[] nums){
int start=0;
int end=nums.length;
Arrays.sort(nums);
if(start!=nums[0]){
    return 0;
}
if(end!=nums[nums.length-1]){
    return end;
}
int mid=-1;
while(start<end){
     mid=(start+end)/2;
     if(end-1==start){
        return mid+1;
     }
     if(mid<nums[mid]){
        end=mid;
     }
     else{
        start=mid;
     }
}
return mid;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] nums={0,1,2,4,5,6};
System.out.println(missingNumber(nums));
sc.close();
}
}
