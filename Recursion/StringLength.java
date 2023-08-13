import java.util.Scanner;

// To find the length of a string
public class StringLength {
    public static int length(String str, int i) {
        if (i == str.length()) {
            return i;
        }
        return length(str, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println(length(str, 0));
    }
}
