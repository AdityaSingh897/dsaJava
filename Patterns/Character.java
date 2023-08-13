import java.util.Scanner;

// Printing character pattern
public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to be displayed:");
        int lines = sc.nextInt();
        int ch = 97;
        for (int i = 97; i < 97 + lines; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) ch);
                ch++;
            }
            System.out.println();
        }
    }
}
