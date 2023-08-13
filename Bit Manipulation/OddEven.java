import java.util.Scanner;

// check whether a number is odd or even
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println(num + " is a odd number");
        } else {
            System.out.println(num + " is a even number");
        }
    }
}
