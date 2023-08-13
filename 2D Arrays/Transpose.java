import java.util.Scanner;

// To find the transpose of a matrix
public class Transpose {
    public static void display(int matrix[][]) {
        System.out.print("Array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int matrix[][]) {
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        display(matrix);
        int transpose[][] = transpose(matrix);
        display(transpose);
    }
}
