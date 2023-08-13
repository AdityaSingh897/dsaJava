import java.util.Scanner;

// calculating maximum sum of different sub arrays using prefix sum array
public class PrefixSum {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void maxSum(int num[]) {
        int prefixArr[] = new int[num.length];
        int currsum = 0;
        int maxsum = 0;
        prefixArr[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefixArr[i] = num[i] + prefixArr[i - 1];
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (i == 0) {
                    currsum = prefixArr[j];
                } else {
                    currsum = prefixArr[j] - prefixArr[i - 1];
                }
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
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
        maxSum(num);

    }
}
