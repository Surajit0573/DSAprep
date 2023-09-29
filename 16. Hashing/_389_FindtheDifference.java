import java.util.*;
public class _389_FindtheDifference{

    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))&&hm.get(t.charAt(i))>0){
                hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            }else{
                return t.charAt(i);
            }
        }
        return 'a';
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}