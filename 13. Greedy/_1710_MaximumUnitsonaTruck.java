import java.util.*;
public class _1710_MaximumUnitsonaTruck{

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,Comparator.comparingDouble(o->o[1]));
        int ans=0;
        for(int i=boxTypes.length-1;i>=0;i--){
            if(truckSize>0){
                ans=ans+(boxTypes[i][1]*Math.min(boxTypes[i][0],truckSize));
                truckSize-=Math.min(boxTypes[i][0],truckSize);
            }else{
                break;
            }
        }
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}