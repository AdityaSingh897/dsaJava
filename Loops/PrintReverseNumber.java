import java.util.Scanner;

// Printing a Reverse of a number
public class PrintReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed:");
        int num = sc.nextInt();
        while (num > 0) {
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num / 10;
        }
    }
}
