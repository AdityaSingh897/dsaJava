import java.util.Scanner;

// To find the shortest distance between starting and final position
public class Displacement {
    public static double displacement(String str) {
        double dis = 0;
        double x = 0;
        double y = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        dis = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return dis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Shortest distance travelled:" + displacement(str));
    }
}
