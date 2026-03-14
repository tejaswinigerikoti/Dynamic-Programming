import java.util.Arrays;
public class MemoFrogJump {
    static int[] dp;   
    public static int frogJump(int i, int[] height) {
        if (i == 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int oneStep = frogJump(i - 1, height) + Math.abs(height[i] - height[i - 1]);
        int twoStep = Integer.MAX_VALUE;
        if (i > 1) {
            twoStep = frogJump(i - 2, height) + Math.abs(height[i] - height[i - 2]);
        }
        dp[i] = Math.min(oneStep, twoStep);
        return dp[i];
    }
    public static void main(String[] args) {
        int[] height = {10, 20, 30, 10};
        int n = height.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        int result = frogJump(n - 1, height);
        System.out.println(result);
    }
}