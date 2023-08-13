import java.util.Scanner;

// Converting Decimal to Binary number system
public class DecimalToBinary {
    public static int DecimaltoBinary(int deci) {
        int bin = 0;
        int n = 0;
        while (deci > 0) {
            int rem = deci % 2;
            bin = bin + rem * (int) Math.pow(10, n);
            deci = deci / 2;
            n++;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int deci = sc.nextInt();
        System.out.println("Binary number:" + DecimaltoBinary(deci));
    }
}
