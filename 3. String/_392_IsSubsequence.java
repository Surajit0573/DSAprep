import java.util.*;
public class _392_IsSubsequence{

    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j>=s.length()){
                return true;
            }
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
        }
        return false;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}