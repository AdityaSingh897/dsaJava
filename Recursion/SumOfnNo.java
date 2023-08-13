import java.util.Scanner;

// To print sum of n natural numbers
public class SumOfnNo {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        sum(n - 1);
        int sum = n + sum(n - 1);
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
