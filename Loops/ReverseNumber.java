import java.util.Scanner;

// Reversing a number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed:");
        int number = sc.nextInt();
        int rev = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            number = number / 10;
            rev = rev * 10 + lastdigit;
        }
        System.out.println("Reversed number:" + rev);
    }
}
