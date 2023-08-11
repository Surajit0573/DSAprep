import java.util.*;

public class _139_Wordbreak { //Time Limit Exceeded

   public static class Node {
        Node child[] = new Node[26];
        boolean eow = false;
        int frequency;

        Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

   

    // Insert
    public static void Insert(String a,Node root) { // O(l) l=length of word
        Node curr = root;
        for (int l = 0; l < a.length(); l++) {
            int idx = a.charAt(l) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
                curr = curr.child[idx];
                curr.frequency = 1;
            } else {
                curr = curr.child[a.charAt(l) - 'a'];
                curr.frequency++;
            }
        }
        curr.eow = true;
    }

    // Scerch
    public static Boolean Scerch(String a,Node root) { // O(l) l=length of word
        Node curr = root;
        Boolean exist = true;
        for (int l = 0; l < a.length(); l++) {
            int idx = a.charAt(l) - 'a';
            if (curr.child[idx] == null) {
                exist = false;
            } else {
                curr = curr.child[idx];
            }
        }
        if (curr.eow != true) {
            exist = false;
        }
        return exist;
    }

    // Word Break Problem
    public static boolean BreakWord(String key,Node root) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (Scerch(key.substring(0, i),root) && BreakWord(key.substring(i),root)) {
                return true;
            }
        }
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Node root = new Node();
        for (int i = 0; i < wordDict.size(); i++) {
            Insert(wordDict.get(i),root);
        }
        return BreakWord(s,root);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String>wordDict=new ArrayList<>();
        wordDict.add("apple");
        System.out.println(wordBreak("b",wordDict));

        sc.close();
    }
}