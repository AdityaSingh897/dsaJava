import java.util.Scanner;

// To find total no of ways in which n friends can be paired up or be single
public class FriendsPairing {
    public static int ways(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int way1 = ways(n - 1);
        int way2 = (n - 1) * ways(n - 2);
        return way1 + way2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends:");
        int n = sc.nextInt();
        System.out.println("Total ways of standing:" + ways(n));
    }
}
