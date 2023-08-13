import java.util.Scanner;

// printing a solid rhombus pattern
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= lines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
