import java.util.Scanner;

// To print all the possible way of placing n queens on n*n chess board so that they dont attack each other.
public class NQueens {
    public static void display(char matrix[][]) {
        System.out.println("-----Chess board-----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int rows, int col) {
        for (int i = rows - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = rows - 1, j = col - 1; j >= 0 && i >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = rows - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void ways(char board[][], int rows) {
        if (rows == board.length) {
            display(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, rows, j)) {
                board[rows][j] = 'Q';
                ways(board, rows + 1);
                board[rows][j] = 'x';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        ways(board, 0);
    }
}
