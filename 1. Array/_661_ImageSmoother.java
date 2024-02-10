import java.util.*;

public class _661_ImageSmoother {

    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = img[i][j];
                int total = 1;

                if (i + 1 < m) {
                    sum += img[i + 1][j];
                    total++;
                    if (j - 1 >= 0) {
                        sum += img[i + 1][j-1];
                        total++;
                    }
                     if (j + 1 < n) {
                        sum += img[i + 1][j+1];
                        total++;
                    }
                }

                 if (i - 1 >=0) {
                    sum += img[i - 1][j];
                    total++;
                    if (j - 1 >= 0) {
                        sum += img[i - 1][j-1];
                        total++;
                    }
                     if (j + 1 < n) {
                        sum += img[i - 1][j+1];
                        total++;
                    }
                }

                if(j+1<n){
                      sum += img[i][j+1];
                    total++;
                }
                if(j-1>=0){
                      sum += img[i][j-1];
                    total++;
                }

                ans[i][j]=sum/total;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}