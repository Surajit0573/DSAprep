import java.util.*;
public class _3_LongestSubstringWithoutRepeatingCharacters{

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int len=1;
        int longest=1;
         HashMap<Character,Integer>hm=new HashMap<>();

         hm.put(s.charAt(0),0);
        for(int i=1;i<s.length();i++){
             len++;
            if(hm.containsKey(s.charAt(i))&&i-len<hm.get(s.charAt(i))){
                len=i-hm.get(s.charAt(i));
                hm.put(s.charAt(i),i);
            }else{
                 hm.put(s.charAt(i),i);
                longest=Math.max(longest,len);
            }
        }
        return longest;

    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}