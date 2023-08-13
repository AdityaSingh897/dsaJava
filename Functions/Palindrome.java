import java.util.Scanner;

// Display Palindrome of a number
public class Palindrome {
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    public static void palindrome(int num) {
        int rev = reverse(num);
        if (rev == num) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        palindrome(num);
    }
}
