import java.util.Scanner;

// To calculate the no. of ways in which tiles of 2*1 size can be fitted on a block of size n*1
public class TilingProblem {
    public static int tiling(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int way1 = tiling(n-1);
        int way2 = tiling(n-2);
        return way1+way2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the block:");
        int n = sc.nextInt();
        System.out.println("No. of ways:" + tiling(n));
    }
}
