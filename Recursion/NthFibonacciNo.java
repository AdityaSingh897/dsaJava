import java.util.Scanner;

// To print nth fibonacci number
public class NthFibonacciNo {
    public static int print(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fibo = print(n - 1) + print(n - 2);

        return fibo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of fibonacci number:");
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
