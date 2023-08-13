import java.util.Scanner;

// Checking for prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int n = 1;
        int i = 0;
        while (n <= number) {
            if (number % n == 0) {
                i = i + 1;
            }
            n = n + 1;
        }
        if (i == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Non prime number");
        }
    }
}
