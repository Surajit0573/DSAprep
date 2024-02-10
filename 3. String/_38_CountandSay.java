import java.util.*;
public class  _38_CountandSay{


    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String ans="1";
        while(--n>0){
            String newans="";
            int count=1;
            for(int i=0;i<ans.length();i++){
                if(i+1==ans.length()||ans.charAt(i+1)!=ans.charAt(i)){
                    newans=newans+String.valueOf(count)+ans.charAt(i);
                    count=1;
                }else{
                    count++;
                }
            }
            ans=newans;
        }

        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}
