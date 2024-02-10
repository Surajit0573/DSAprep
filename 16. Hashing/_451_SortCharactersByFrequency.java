import java.util.HashMap;

class Solution {

    public static class pair implements Comparable<pair> {
        char s;
        int val;

        pair(char s, int val) {
            this.s = s;
            this.val = val;
        }

        public int compareTo(pair p) {
            return  p.val-this.val ;
        }
    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        pair[] arr = new pair[hm.size()];
        Set<Character> key = hm.keySet();
        int x = 0;
        for (Character k : key) {
            arr[x] = (new pair(k, hm.get(k)));
            x++;
        }
        Arrays.sort(arr);
        String ans="";
        for(int i=0;i<arr.length;i++){
            while(arr[i].val>0){
            ans=ans+arr[i].s;
            arr[i].val--;
            }
        }
        return ans;

    }
}
