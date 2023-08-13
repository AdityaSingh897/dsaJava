import java.util.*;

// to swap 2 numbers in an ArrayList
public class Swapping {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the ArrayList:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter index1:");
        int idx1 = sc.nextInt();
        System.out.println("Enter index2:");
        int idx2 = sc.nextInt();
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
