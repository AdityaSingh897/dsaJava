import java.util.Scanner;

// bill of items
public class GST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil:");
        float pencil = sc.nextFloat();
        System.out.println("Enter cost of pen:");
        float pen =sc.nextFloat();
        System.out.println("Enter cost of eraser:");
        float eraser = sc.nextFloat();
        double sum = (pen+pen*0.18)+(pencil+pencil*0.18)+(eraser+eraser*0.18);
        System.out.println("Total amount:"+sum);       
    }

}
