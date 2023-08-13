import java.util.Scanner;

// code for Quick sort
public class QuickSort {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int num[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pi = partition(num, si, ei);
        quickSort(num, si, pi - 1);
        quickSort(num, pi + 1, ei);
    }

    public static int partition(int num[], int si, int ei) {
        int pivot = num[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (num[j] <= pivot) {
                i++;
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        num[ei] = num[i];
        num[i] = temp;
        return i;
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
        quickSort(num, 0, num.length - 1);
        display(num);
    }
}
