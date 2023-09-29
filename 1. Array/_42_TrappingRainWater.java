import java.util.*;

public class _42_TrappingRainWater {

    public int trap(int[] height) {
        // left max
        int[] left = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (max > height[i]) {
                left[i] = max;
            } else {
                left[i] = 0;
                max = height[i];
            }
        }
        // right max
        int[] right = new int[height.length];
        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (max > height[i]) {
                right[i] = max;
            } else {
                right[i] = 0;
                max = height[i];
            }

        }
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            if (Math.min(left[i], right[i]) > height[i]) {
                ans = ans + (Math.min(left[i], right[i]) - height[i]);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}