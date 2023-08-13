import java.util.Scanner;

// To add 1 to an integer
public class AddOne {
    public static int add(int num) {
        num = -~num;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("After adding 1:" + add(num));
    }
}
