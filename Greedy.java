import java.util.*;
public class Greedy {
    public static int Solve(int index, int capacity, int[] weight, int[] value) {
        if (index == 0) {
            if (weight[0] <= capacity) {
                return value[0];
            } else {
                return 0;
            }
        }
        int skipitem = Solve(index - 1, capacity, weight, value);
        int takeitem = Integer.MIN_VALUE;
        if (weight[index] <= capacity) {
            takeitem = value[index] + Solve(index - 1, capacity - weight[index], weight, value);
        }
        return Math.max(takeitem, skipitem);
    }
    public static void main(String[] args) {
        int[] value = {60, 40, 70, 30};
        int[] weight = {3, 2, 4, 1};
        int capacity = 5;
        int n = value.length;
        int result = Solve(n - 1, capacity, weight, value);
        System.out.println("The optimal solution is : " + result);
    }
}