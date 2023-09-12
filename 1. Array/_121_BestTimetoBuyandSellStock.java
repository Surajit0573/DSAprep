import java.util.*;
public class _121_BestTimetoBuyandSellStock{

    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}