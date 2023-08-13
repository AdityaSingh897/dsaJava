import java.util.Scanner;

//Average of 3 numbers
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        float A = sc.nextFloat();
        System.out.println("Enter 2nd no:");
        float B = sc.nextFloat();
        System.out.println("Enter 3rd no:");
        float C = sc.nextFloat();
        double average = (A + B + C) / 3;
        System.out.println("Average of A,B & C:" + average);
    }
}