import java.util.Scanner;

// Displaying Binomial Coefficient that is nCr.
public class BinomialCoefficient {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomialcoeff(int n, int r) {
        int x = factorial(n);
        int y = factorial(r);
        int z = factorial(n - r);
        int BC = x / (y * z);
        return BC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        System.out.println();
        System.out.println("Binomial Coefficient:" + binomialcoeff(n, r));
    }
}