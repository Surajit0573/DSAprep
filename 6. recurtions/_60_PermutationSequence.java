import java.util.*;
public class _60_PermutationSequence{

//Insted of recurtion use math 
    public String getPermutation(int n, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            arr.add(i);
        }
        k=k-1;
        String ans="";
        while(!arr.isEmpty()){
            int num=fact/arr.size();
            ans=ans+arr.remove(k/num);
            k=k%num;
            fact=num;
        }
        return ans;
        
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}