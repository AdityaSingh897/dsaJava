import java.util.Scanner;

// code for Merge sort
public class MergeSort {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int num[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(num, si, mid);
        mergeSort(num, mid + 1, ei);
        Sort(num, si, mid, ei);
    }

    public static void Sort(int num[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (num[i] < num[j]) {
                temp[k] = num[i];
                i++;
            } else {
                temp[k] = num[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = num[i++];
        }
        while (j <= ei) {
            temp[k++] = num[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            num[i] = temp[k];
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
        mergeSort(num, 0, num.length - 1);
        display(num);
    }
}
