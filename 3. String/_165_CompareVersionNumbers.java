import java.util.*;
public class _165_CompareVersionNumbers{

    public int compareVersion(String version1, String version2) {
        ArrayList<Integer>arr=new ArrayList<>();
        int prev=0;
        for(int i=0;i<=version1.length();i++){
            if(i==version1.length()||version1.charAt(i)=='.'){
                arr.add(Integer.parseInt(version1.substring(prev, i)) );
                prev=i;
            }
        }

          ArrayList<Integer>arr2=new ArrayList<>();
        prev=0;
        for(int i=0;i<=version2.length();i++){
            if(i==version2.length()||version2.charAt(i)=='.'){
                arr2.add(Integer.parseInt(version2.substring(prev, i)) );
                prev=i;
            }
        }

        int j=0;
        while(j<arr.size()&&j<arr2.size()){
            if(arr.get(j)>arr2.get(j)){
                return 1;
            }
            if(arr.get(j)<arr2.get(j)){
                return -1;
            }
            j++;
        }
        while(j<arr.size()){
            if(arr.get(j)!=0){
                return 1;
            }
            j++;
        }
        while(j<arr2.size()){
            if(arr2.get(j)!=0){
                return -1;
            }
            j++;
        }
        return 0;
        
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}