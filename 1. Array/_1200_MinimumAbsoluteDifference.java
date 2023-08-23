import java.util.*;

public class _1200_MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int[] diff = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff[i - 1] = arr[i] - arr[i - 1];
            min = Math.min(min, diff[i - 1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < diff.length; i++) {

            if (diff[i] == min) {
                List<Integer> curr = new ArrayList<>();
                curr.add(arr[i]);
                curr.add(arr[i+1]);
                ans.add(curr);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}