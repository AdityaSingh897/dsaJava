import java.util.Scanner;

// Calculating max sub array sum using kadanes algorithm
public class KadanesAlgo {
    public static void display(int num[]) {
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void kadanes(int num[]) {
        int prefixArr[] = new int[num.length];
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        prefixArr[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefixArr[i] = num[i] + prefixArr[i - 1];
        }
        for (int i = 0; i < num.length; i++) {
            currsum = currsum + num[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
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
        kadanes(num);
    }
}
