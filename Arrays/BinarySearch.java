import java.util.Scanner;

// searching for an item using binary search method
public class BinarySearch {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key < num[mid]) {
                end = mid - 1;
            } else if (key > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
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
        System.out.println("Enter element to be searched:");
        int key = sc.nextInt();
        int index = binarySearch(num, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index:" + binarySearch(num, key));
        }
    }
}
