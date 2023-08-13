import java.util.Scanner;

// printing butterfly pattern
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter half the number of lines:");
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (lines - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= lines - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
