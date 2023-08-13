import java.util.Scanner;

// To find the no of ways to reach from 0,0 to n-1,m-1 in a n*m grid, allowed movement - right & down
public class GridWays {
    public static int ways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int w1 = ways(i + 1, j, n, m);
        int w2 = ways(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter m:");
        int m = sc.nextInt();

        System.out.println(ways(0, 0, n, m));
    }
}
