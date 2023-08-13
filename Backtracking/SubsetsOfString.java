import java.util.Scanner;

// To print all the subsets of a given string
public class SubsetsOfString {
    public static void subSets(String str, int i, String temp) {
        if (i == str.length()) {
            System.out.println(temp);
            return;
        }
        subSets(str, i + 1, temp + str.charAt(i));
        subSets(str, i + 1, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        subSets(str, 0, "");
    }
}
