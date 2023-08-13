
// Calculate max profit you can generate from buying and selling of stocks
public class Stocks {
    public static int maxprofit(int stockprice[]) {
        int n = stockprice.length;
        int minleftarr[] = new int[n];
        int maxrightarr[] = new int[n];
        minleftarr[0] = stockprice[0];
        maxrightarr[n - 1] = stockprice[n - 1];
        for (int i = 1; i < n; i++) {
            minleftarr[i] = Math.min(minleftarr[i - 1], stockprice[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            maxrightarr[i] = Math.max(maxrightarr[i + 1], stockprice[i]);
        }
        int profit = 0, max_profit = 0;
        for (int i = 0; i < n; i++) {
            profit = maxrightarr[i] - minleftarr[i];
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int stockprice[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum profit:" + maxprofit(stockprice));
    }
}
