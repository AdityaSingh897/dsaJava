import java.util.Scanner;

// To swap two numbers
public class SwapNumbers {
    public static void swap(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        swap(num1, num2);
    }
}
