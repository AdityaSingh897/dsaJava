import java.util.Scanner;

// To find the largest string
public class LargestString {
    public static String largestString(String arr[]) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Strings to be compared:");
        int n = sc.nextInt();
        String arr[] = new String[n + 1];
        System.out.println("Enter strings:");
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Largest String is:" + largestString(arr));
    }
}
