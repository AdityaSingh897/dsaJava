import java.util.Scanner;

// To print an integer into a word eg. 1 as one
public class IntToString {
    static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void conversion(int n) {
        if (n == 0) {
            return;
        }
        conversion(n / 10);
        System.out.print(arr[n % 10] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        conversion(n);
    }
}
