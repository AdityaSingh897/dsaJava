
// To calculate a to the power b using fast exponential method
public class UpperCaseToLowerCase {
    public static void changeCase() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) (i | ' '));
        }
    }

    public static void main(String[] args) {
        changeCase();
    }
}
