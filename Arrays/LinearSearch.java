import java.util.Scanner;

// searching for an item using linear search method
public class LinearSearch {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
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
        int index = linearSearch(num, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index:" + linearSearch(num, key));
        }
    }
}