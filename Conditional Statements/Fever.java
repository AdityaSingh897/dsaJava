import java.util.Scanner;

//checking fever or not
public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahernheit:");
        float temp = sc.nextFloat();
        /*
         * if (temp > 100) {
         * System.out.println("You have a fever");
         * } else {
         * System.out.println("You dont have a fever");
         * }
         */
        String result = temp > 100 ? "Fever" : "No Fever";
        System.out.println(result);
    }
}
