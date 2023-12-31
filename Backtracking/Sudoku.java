
// Print a Sudoku
public class Sudoku {
    public static void display(int sudoku[][]) {
        System.out.println("-----Sudoku-----");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        int sc = (col / 3) * 3;
        int sr = (row / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solver(int sudoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }
        if (sudoku[row][col] != 0) {
            return solver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },

                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (solver(sudoku, 0, 0)) {
            System.out.println("Solution found!");
            display(sudoku);
        } else {
            System.out.println("No solution found!");
        }
    }
}
