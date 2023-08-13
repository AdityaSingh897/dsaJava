import java.util.Scanner;

// To clear last i bits of a number
public class ClearLastiBits {
    public static int clear(int num, int i) {
        int bitmask = -1 << i;
        return (num & bitmask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter last i bits:");
        int i = sc.nextInt();
        System.out.println(clear(num, i));
    }
}
