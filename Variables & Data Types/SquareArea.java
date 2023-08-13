import java.util.Scanner;

//Area of a square
public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square:");
        float side = sc.nextFloat();
        double area = side * side;
        System.out.println("Area of square:" + area);
    }
}
