import java.util.*;

public class _1647_MinimumDeletionstoMakeCharacterFrequenciesUnique {

    public int minDeletions(String s) {
        int[] f = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            f[idx]++;
        }
        Arrays.sort(f);
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (f[i] == 0) {
                continue;
            }
            if (i > 0 && f[i] == f[i - 1]) {
                while (f[i] > 0) {
                    f[i]--;
                    count++;
                    if (f[i] != 0 && !hs.contains(f[i])) {
                        hs.add(f[i]);
                        break;
                    }
                }
                int temp = f[i];
                f[i] = f[i - 1];
                f[i - 1] = temp;
            } else {
                hs.add(f[i]);
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}