import java.util.Scanner;

// To calculate a to the power b using fast exponential method
public class FastExponential {
    public static int power(int num, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = num * ans;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter its power:");
        int pow = sc.nextInt();
        System.out.println(power(num, pow));
    }
}
