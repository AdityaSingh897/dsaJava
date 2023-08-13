import java.util.Scanner;

// To find the value of x to the power n
public class XToPowerN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int pow = x * power(x, n - 1);
        return pow;
    }

    // Optimized
    public static int xpowern(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpow = xpowern(x, n / 2);
        if (n % 2 != 0) {
            return x * halfpow * halfpow;
        }
        return halfpow * halfpow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("x^n:" + power(x, n));
        System.out.println("x^n:" + xpowern(x, n));
    }
}
