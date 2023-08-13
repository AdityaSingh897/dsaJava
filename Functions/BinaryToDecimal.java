import java.util.Scanner;

// Converting Binary to Decimal number system
public class BinaryToDecimal {
    public static int BinarytoDecimal(int bin) {
        int deci = 0;
        double n = 0;
        while (bin > 0) {
            double lastdigit = bin % 10;
            deci = deci + (int) (lastdigit * Math.pow(2, n));
            bin = bin / 10;
            n++;
        }
        return deci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int bin = sc.nextInt();
        System.out.println("Decimal number:" + BinarytoDecimal(bin));
    }
}
