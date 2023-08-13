import java.util.Scanner;

// To check if a number is a power of 2 or not
public class PowerOfTwo {
    public static boolean power(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(power(num));
    }
}
