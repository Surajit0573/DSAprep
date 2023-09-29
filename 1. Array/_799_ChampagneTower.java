import java.util.*;

public class _799_ChampagneTower {

    public double champagneTower(int poured, int query_row, int query_glass) {
        if (query_row == 0) {
            if (poured == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        ArrayList<Double>[] row = new ArrayList[100];
        row[0] = new ArrayList<>();
        row[0].add((double) poured);
        for (int i = 1; i < 100; i++) {
            row[i] = new ArrayList<>();
            double now = (row[i - 1].get(0) - 1) / 2;
            if (now > 0) {
                row[i].add(now);
            }else{
                row[i].add(0.0000000);
            }
            // System.out.print(row[i].get(0)+" ");
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    row[i].add(row[i].get(0));
                } else {
                    double curr=0;
                    if((row[i - 1].get(j)>0)&&(row[i - 1].get(j - 1))>0){
                    curr = ((row[i - 1].get(j) + row[i - 1].get(j - 1)) - 2) / 2;
                    }else{
                    curr = ((row[i - 1].get(j) + row[i - 1].get(j - 1)) - 1) / 2;
                    }
                    if (curr > 0) {
                        row[i].add(curr);
                    } else {
                        row[i].add(0.0000000);
                    }
                }
            }
            if (query_row == i) {
                if (row[i].get(query_glass) > 1) {
                    return 1;
                } else {
                    return row[i].get(query_glass);
                }
            }

        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}