import java.util.Scanner;

// Average of 3 numbers
public class Average3Numbers {
    public static float average(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("Average:" + average(a, b, c));
    }
}
