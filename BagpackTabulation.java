import java.util.*;
public class BagpackTabulation {
    public static int knapsack(int[] weight, int[] value, int capacity) {
        int n = weight.length;
        int[][] dp = new int[n][capacity + 1];
        for(int w = weight[0]; w <= capacity; w++){
            dp[0][w] = value[0];
        }
        for(int i = 1; i < n; i++){
            for(int w = 0; w <= capacity; w++){
                int notTake = dp[i-1][w];
                int take = Integer.MIN_VALUE;
                if(weight[i] <= w){
                    take = value[i] + dp[i-1][w - weight[i]];
                }
                dp[i][w] = Math.max(take, notTake);
            }
        }
        return dp[n-1][capacity];
    }
    public static void main(String[] args) {
        int[] weight = {3,2,4,1};
        int[] value = {60,40,70,30};
        int capacity = 5;
        int result = knapsack(weight, value, capacity);

        System.out.println("Maximum value: " + result);
    }
}