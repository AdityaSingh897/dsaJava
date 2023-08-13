import java.util.Scanner;

// Printing an inverted and rotated half pyramid pattern
public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to be displayed:");
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = lines; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
