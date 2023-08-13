import java.util.Scanner;

// To print all the permutations of a given string
public class PermutationOfString {
    public static void permutations(String str, String temp) {
        if (str.length() == 0) {
            System.out.println(temp);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            permutations(Newstr, temp + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        permutations(str, "");
    }
}
