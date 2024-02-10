import java.util.*;

public class _37_SudokuSolver {

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static boolean solve(char[][] suduku, int r, int c) {
        // Base Case
        if (r == 9) {
            return true;
        }
        if (c == 9) {
            return solve(suduku, r + 1, 0);
        }

        // Recurtions
        if (suduku[r][c] !='0') {
            return solve(suduku, r, c + 1);
        } else {
            for (int i = 1; i < 10; i++) {
                if (isSafe(suduku, r, c, i)) {
                    suduku[r][c] = (char)i;
                    if (solve(suduku, r, c + 1)) {
                        return true;
                    } else {
                        suduku[r][c] = '0';
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] suduku, int r, int c, int num) {

        // vertical
        for (int i = 0; i < 9; i++) {
            if (suduku[i][c] == (char)num) {
                return false;
            }
        }
        // horizontal
        for (int j = 0; j < 9; j++) {
            if (suduku[r][j] ==(char)num) {
                return false;
            }
        }
        // grid [I am God (:]
        int Gr = r / 3;
        int Gc = c / 3;
        for (int k = Gr * 3; k < (Gr + 1) * 3; k++) {
            for (int l = Gc * 3; l < (Gc + 1) * 3; l++) {
                if (suduku[k][l] == (char)num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}