import java.util.Scanner;

// To print all the indices of a given number in an array
public class Occurence {
    public static void occurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }
        occurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        occurence(arr, key, 0);
    }
}
