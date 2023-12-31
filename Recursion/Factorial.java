import java.util.Scanner;

// To print factorial of a number
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        factorial(n - 1);
        int fact = n * factorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
