import java.util.Scanner;

// to search for an index of a given element in a rotated sorted array
public class SearchRotatedSortedArr {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static int search(int num[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (num[mid] == target) {
            return mid;
        }
        if (num[si] <= num[mid]) {
            if (num[si] <= target && num[mid] >= target) {
                return search(num, si, mid - 1, target);
            } else {
                return search(num, mid + 1, ei, target);
            }
        } else {
            if (num[mid] <= target && num[ei] >= target) {
                return search(num, mid + 1, ei, target);
            } else {
                return search(num, si, mid - 1, target);
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
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        display(num);
        System.out.println("Index of target is:" + search(num, 0, num.length - 1, target));
    }
}
