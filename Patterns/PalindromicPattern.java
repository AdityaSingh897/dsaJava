import java.util.Scanner;

// printing a palindromic pattern with numbers
public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to be displayed:");
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
