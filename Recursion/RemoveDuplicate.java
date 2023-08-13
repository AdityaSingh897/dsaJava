import java.util.Scanner;

// To remove duplicate letters from a string
public class RemoveDuplicate {
    public static void removeDup(String str, int i, StringBuilder sb, boolean map[]) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }
        char currchar = str.charAt(i);
        if (map[currchar - 'a'] == true) {
            removeDup(str, i + 1, sb, map);
        } else {
            map[str.charAt(i) - 'a'] = true;
            removeDup(str, i + 1, sb.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        removeDup(str, 0, new StringBuilder(), new boolean[26]);
    }
}
