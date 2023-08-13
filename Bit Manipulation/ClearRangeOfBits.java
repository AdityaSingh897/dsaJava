import java.util.Scanner;

// To clear a range of bits of a number
public class ClearRangeOfBits {
    public static int clear(int num, int i, int j) {
        int bitmask = (-1 << j + 1) | ((1 << i) - 1);
        return (num & bitmask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter range of bits:");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(clear(num, i, j));
    }
}
