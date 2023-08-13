import java.util.Scanner;

// To search the number of times an items is present in an array
public class Occurence {
    public static void display(int matrix[][]) {
        System.out.print("Array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int occurence(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    count++;
                }
            }
        }
        return count;
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
        System.out.println("Enter an element to find its occurence:");
        int key = sc.nextInt();
        display(matrix);
        System.out.println("Occurence of element:" + occurence(matrix, key));
    }
}
