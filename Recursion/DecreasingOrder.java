import java.util.Scanner;

// To print number from n to 1 in decreasing order
public class DecreasingOrder {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an upper limit:");
        int n = sc.nextInt();
        print(n);
    }
}
