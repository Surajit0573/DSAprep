import java.util.*;
public class _852_PeakIndexinaMountainArray{

    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(true){
            mid=start-((start-end)/2);
            if(mid>0&&arr[mid]>arr[mid-1]&&mid+1<arr.length&&arr[mid]>arr[mid+1]){
                break;
            }
            else if(mid>0&&arr[mid]>arr[mid-1]){
                start=mid;
            }else if(mid+1<arr.length&&arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return mid;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}