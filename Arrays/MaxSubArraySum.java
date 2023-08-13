import java.util.Scanner;

// finding maximum sum of different sub arrays
public class MaxSubArraySum {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void subArrays(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    currsum = currsum + num[k];
                }
                System.out.println("Sum of subarray:" + currsum);
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum:" + maxsum);
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
        subArrays(num);
    }
}
