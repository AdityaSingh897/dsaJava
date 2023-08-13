import java.util.*;

// to find the maximum number in an ArrayList
public class FindMax {
    public static int findMax(ArrayList<Integer> num) {
        int max = Integer.MIN_VALUE;
        ;
        for (int i = 0; i < num.size(); i++) {
            max = Math.max(max, num.get(i));
        }
        return max;
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
        System.out.println("Maximum number:" + findMax(num));
    }
}
