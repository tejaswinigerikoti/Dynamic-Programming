import java.util.*;
public class TabulationFrogJump {
    public static int frogJump( int[] height) {
        int n = height.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int oneStep = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            int twoStep = Integer.MAX_VALUE;
            if (i > 1) {
                twoStep = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            }
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] height = {10, 20, 30, 10};
        int n = height.length;
        int result = frogJump(height);
        System.out.println(result);
    }
}