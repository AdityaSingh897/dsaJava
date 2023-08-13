
// Trapping rainwater problem [DSA Sheet Q.22]
public class TrappingRainwater {
    public static int trapRW(int height[]) {
        int vol = 0, total_vol = 0;
        int maxleftarr[] = new int[height.length];
        int maxrightarr[] = new int[height.length];
        maxleftarr[0] = height[0];
        maxrightarr[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            maxleftarr[i] = Math.max(maxleftarr[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            maxrightarr[i] = Math.max(maxrightarr[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            int trapw = Math.min(maxleftarr[i], maxrightarr[i]);
            vol = trapw - height[i];
            total_vol = vol + total_vol;
        }
        return total_vol;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int vol = trapRW(height);
        System.out.println("Volume of water:" + vol);
    }
}
