import java.util.Scanner;

// check perform operation on ith bit of a binary number
public class ithBitOpr {
    public static void get(int num, int i) {
        int bitmask = i << i;
        if ((num & bitmask) == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }
    }

    public static void set(int num, int i) {
        int bitmask = 1 << i;
        System.out.println((num | bitmask) + ":after set");
    }

    public static void clear(int num, int i) {
        int bitmask = 1 << i;
        System.out.println((num ^ bitmask) + ":after clear");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter i:");
        int i = sc.nextInt();
        get(num, i);
        set(num,i);
        clear(num,i);
    }
}
