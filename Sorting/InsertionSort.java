import java.util.Scanner;

// code for Insertion sorting
public class InsertionSort {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void insertionsort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        display(num);
        insertionsort(num);
        display(num);
    }
}
