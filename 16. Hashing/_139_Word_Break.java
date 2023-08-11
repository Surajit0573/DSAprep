import java.util.*;
public class _139_Word_Break{ //Time Limit Exceeded

    // Word Break Problem
    public static boolean BreakWord(String key,HashSet<String> hs,TreeSet<Integer> l) {
        if (key.length() == 0) {
            return true;
        }
        for (Integer i:l) {

            if (i<=key.length()&&hs.contains(key.substring(0, i)) && BreakWord(key.substring(i),hs,l)) {
                return true;
            }
        }
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
       HashSet<String>hs=new HashSet<>();
       TreeSet<Integer>l=new TreeSet<>();
        for (int i = 0; i < wordDict.size(); i++) {
         hs.add(wordDict.get(i));
         l.add(wordDict.get(i).length());
        }
        TreeSet<Integer> res = (TreeSet<Integer>)l.descendingSet();
        return BreakWord(s,hs,res);
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}