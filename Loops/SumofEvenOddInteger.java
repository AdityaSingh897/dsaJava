import java.util.Scanner;

// Calculating sum of even and odd integers
public class SumofEvenOddInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int check = 1;
        while (check == 1) {
            System.out.println("Enter number:");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                even = even + number;
            } else {
                odd = odd + number;
            }
            System.out.println("press 1 to continue and 0 to exit");
            check = sc.nextInt();
        }
        System.out.println("Sum of even numbers:" + even);
        System.out.println("Sum of odd numbers:" + odd);
    }
}
