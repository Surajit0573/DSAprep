import java.util.*;

public class _118_Pascal_Triangle {

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
                List<Integer> prev =new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    curr.add(1);
                } else if (j == i) {
                    curr.add(1);
                }else{
                    curr.add(prev.get(j-1)+prev.get(j));
                }
            }
            ans.add(curr);
            prev=curr;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}