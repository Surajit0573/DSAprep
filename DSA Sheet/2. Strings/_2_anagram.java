import java.util.*;
public class _2_anagram{


 public static boolean isAnagram(String s, String t) {
    if(t.length()!=s.length()){
        return false;
    }
   int[] f=new int[26];
    Arrays.fill(f,0);
    for(int i=0;i<s.length();i++){
        f[s.charAt(i)-'a']++;
    }
    for(int i=0;i<t.length();i++){
        f[t.charAt(i)-'a']--;
    }
    for(int i=0;i<26;i++){
        if(f[i]>0){
            return false;
        }
    }
        return true;
    }


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(isAnagram("anagram", "nagaram"));
sc.close();
}
}