import java.util.Scanner;

// Printing an inverted half number pyramid pattern
public class InvertedHalfNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to be displayed:");
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
