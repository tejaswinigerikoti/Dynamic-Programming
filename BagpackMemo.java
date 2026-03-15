public class BagpackMemo{
    static int knapsack(int index, int capacity, int[] weight, int[] value, int[][] dp) {
        if (index == 0) {
            if (weight[0] <= capacity)
                return value[0];
            return 0;
        }
        if (dp[index][capacity] != 0)
            return dp[index][capacity];

        int notTake = knapsack(index - 1, capacity, weight, value, dp);

        int take = Integer.MIN_VALUE;
        if (weight[index] <= capacity) {
            take = value[index] +
                   knapsack(index - 1, capacity - weight[index], weight, value, dp);
        }

        dp[index][capacity] = Math.max(take, notTake);

        return dp[index][capacity];
    }
    public static void main(String[] args) {
        int[] weight = {3,2,4,1};
        int[] value = {60,40,70,30};
        int capacity = 5;
        int[][] dp = new int[4][capacity + 1];
        int result = knapsack(3, capacity, weight, value, dp);
        System.out.println("Maximum value: " + result);
    }
}