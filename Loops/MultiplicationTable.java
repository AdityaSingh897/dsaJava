import java.util.Scanner;

// Print multiplication table of a number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int val;
        for (int i = 1; i <= 10; i++) {
            val = num * i;
            System.out.println(num + " * " + i + " = " + val);
        }
    }
}
