import java.util.*;
public class _493_ReversePairs{

    public static int margesort(int[] nums,int start,int end){
        if(start>=end){
            return 0;
        }
        int mid =(start+end)/2;
        int count1=margesort(nums,start,mid);
        int count2=margesort(nums,mid+1,end);
        int count3=count(nums,start,mid,end);
        marge(nums,start,end,mid);
        return count1+count2+count3;

        }
        public static void marge(int[] nums,int start,int end,int mid){
            int[] temp=new int[end-start+1];
            int i=start;
            int j=mid+1;
            int k=0;
            while(i<=mid&&j<=end){
                if(nums[i]<=nums[j]){
                    temp[k]=nums[i];
                    i++;
                }else{
                    temp[k]=nums[j];
                    j++;
                }
                k++;
            }
            while(i<=mid){
                temp[k++]=nums[i++];
            }
             while(j<=end){
                temp[k++]=nums[j++];
            }
            int s=start;
            for(int x=0;x<temp.length;x++){
                nums[s++]=temp[x];
            }

        }

        public static int count(int[] arr,int low,int mid,int high){
           
            int right=mid+1;
           int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && Math.ceil((double)arr[i]/2) >arr[right]) right++;
            cnt += (right - (mid + 1));
        }
            return cnt;
        }

    public int reversePairs(int[] nums) {
        return margesort(nums, 0, nums.length-1);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}