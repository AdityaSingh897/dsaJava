import java.util.Scanner;

// code to add the diagonal elements of an array
public class DiagonalSum {
    public static void display(int matrix[][]) {
        System.out.print("Array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            if (i != matrix.length-1-i) {
                sum = sum + matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
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
        System.out.println("Sum of diagonal elements:" + diagonalSum(matrix));
    }
}
