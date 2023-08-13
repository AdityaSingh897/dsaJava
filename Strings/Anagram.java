import java.util.Arrays;
import java.util.Scanner;

// To check if the 2 strings are anagram or not
public class Anagram {
    public static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char charstr1[] = str1.toCharArray();
        char charstr2[] = str2.toCharArray();
        Arrays.sort(charstr1);
        Arrays.sort(charstr2);
        if (Arrays.equals(charstr1, charstr2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(anagram(str1, str2));
    }
}
