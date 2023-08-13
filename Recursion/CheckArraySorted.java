import java.util.Scanner;

// To check if an array is sorted or not
public class CheckArraySorted {
    public static boolean checkSort(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSort(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkSort(arr, 0));
    }
}
