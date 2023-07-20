import java.util.*;

public class _735_AsteroidCollision {

    public int[] asteroidCollision(int[] a) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (a[i] < 0) {
                while (arr.size()>0&&arr.get(arr.size() - 1) > 0 && arr.get(arr.size() - 1) < Math.abs(a[i])) {
                    arr.remove(arr.size() - 1);
                }
                if ((arr.size()>0&&arr.get(arr.size() - 1) < 0)||arr.size()==0) {
                    arr.add(a[i]);

                }
                if (arr.size()>0&&arr.get(arr.size() - 1) == Math.abs(a[i])) {
                    arr.remove(arr.size() - 1);
                }

            } else {
                arr.add(a[i]);
            }

        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}