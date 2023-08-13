import java.util.Scanner;

// To print number from 1 to n in increasing order
public class IncreasingOrder {

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an upper limit:");
        int n = sc.nextInt();
        print(n);
    }
}
