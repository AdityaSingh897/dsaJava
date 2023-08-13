import java.util.Scanner;

// To print all the binary strings of size n without consecutive 1
public class BinaryStringsProblem {
    public static void binStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of binary string:");
        int n = sc.nextInt();
        binStrings(n, 0, "");
    }
}
