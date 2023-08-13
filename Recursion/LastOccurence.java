import java.util.Scanner;

// To find the last occurence of an element in an array
public class LastOccurence {
    public static int occurence(int arr[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return occurence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to be found:");
        int key = sc.nextInt();
        System.out.println("Element found at:" + occurence(arr, key, arr.length - 1));
    }
}
