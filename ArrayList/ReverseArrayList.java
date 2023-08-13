import java.util.*;

// code to reverse the items of an arraylist
public class ReverseArrayList {
    public static void reverse(ArrayList<Integer> num) {
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.print(num.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the ArrayList:");
        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>(n);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        System.out.println(num);
        reverse(num);
    }
}
