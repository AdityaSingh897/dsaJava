import java.util.Scanner;

// Printing an inverted star pattern
public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to be displayed:");
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = lines; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
