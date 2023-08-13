import java.util.Scanner;

// code for Selection sorting
public class SelectionSort {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void selectionsort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[smallest] > num[j]) {
                    smallest = j;
                }
            }
            int temp = num[smallest];
            num[smallest] = num[i];
            num[i] = temp;
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
        selectionsort(num);
        display(num);
    }
}
