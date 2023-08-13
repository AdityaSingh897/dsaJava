import java.util.*;

// to sort numbers in an ArrayList
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the ArrayList:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
