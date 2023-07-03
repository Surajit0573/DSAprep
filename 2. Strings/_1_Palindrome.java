import java.util.*;
public class _1_Palindrome {
public static boolean isPalindrome(String s) {
        ArrayList<Character> newS=new ArrayList<>();
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)-'a'<26&&s.charAt(i)-'a'>=0){
            newS.add(s.charAt(i));
        }
        else if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<10){
            newS.add(s.charAt(i));
        }
    }
    int n=newS.size();
    if(n==0||n==1){
        return true;
    }
    for(int i=0;i<=n/2;i++){
        if(newS.get(i)!=newS.get(n-i-1)){
            return false;
        }
    }
        return true;
        
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
sc.close();
}
}