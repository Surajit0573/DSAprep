import java.util.*;
public class _5_LongestPalindromicSubstring {

    public static String expand(String s,int left,int right){
       while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
        left--;
        right++;
       }
       return s.substring(left+1, right);
    }
    

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String maxStr=s.charAt(0)+"";
       for(int i=0;i<s.length()-1;i++){
        String odd=expand(s,i,i);
        String even=expand(s,i,i+1);
        if (odd.length() > maxStr.length()) {
            maxStr = odd;
        }
        if (even.length() > maxStr.length()) {
            maxStr = even;
        }
       }
       return maxStr;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}
