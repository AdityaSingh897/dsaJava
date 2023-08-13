import java.util.Scanner;

// To perform addition,sub and mul on complex number entered by user.
public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of num1:");
        int r1 = sc.nextInt();
        System.out.println("Enter imaginary part of num1:");
        int i1 = sc.nextInt();
        System.out.println("Enter real part of num2:");
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary part of num2:");
        int i2 = sc.nextInt();
        Complex c = new Complex();
        c.add(r1, i1, r2, i2);
        c.sub(r1, i1, r2, i2);
        c.mul(r1, i1, r2, i2);
    }
}

class Complex {
    void add(int r1, int i1, int r2, int i2) {
        System.out.println("Sum:" + (r1 + r2) + "+i" + (i1 + i2));
    }

    void sub(int r1, int i1, int r2, int i2) {
        System.out.println("Difference:" + (r1 - r2) + "+i" + (i1 - i2));
    }

    void mul(int r1, int i1, int r2, int i2) {
        System.out.println("Product:" + (r1 * r2) + "+i" + (i1 * i2));
    }
}