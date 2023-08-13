import java.util.Scanner;

// code to search an items of a sorted array through binary search
public class BinarySearch {
    public static void display(int matrix[][]) {
        System.out.print("Array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean binarySearch(int matrix[][], int key) {
        int n = 0;
        int m = matrix[0].length - 1;
        while (m >= 0 && n < matrix.length) {
            if (key == matrix[n][m]) {
                System.out.println("Element found at:" + n + ", " + m);
                return true;
            } else if (key < matrix[n][m]) {
                m = m - 1;
            } else if (key > matrix[n][m]) {
                n = n + 1;
            }
        }
        System.out.println("Element not found");
        return false;
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
        System.out.println("Enter an element to search:");
        int key = sc.nextInt();
        display(matrix);
        binarySearch(matrix, key);
    }
}
