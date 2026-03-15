import java.util.*;
public class BagpackTabulation {
    static int knapsack(int weight[],int value[],int capacity){;
        int n=weight.length;
        int dp[][]=new int[n][capacity+1];
        for(int c=weight[0];c<=capacity;c++){
            dp[0][c]=value[0];
        }
        for(int i=1;i<n;i++){
            for(int c=0;c<=capacity;c++){
                int nottake=dp[i-1][c];
                int take=Integer.MIN_VALUE;
                if(weight[i]<=c){
                    take=value[i]+dp[i-1][c-weight[i]];
                }
                dp[i][c]= Math.max(take,nottake);
            }
        }
        return dp[n-1][capacity];
    }

    public static void main(String[] args) {
        int weight[]={3,2,4,1};
        int value[]={60,40,70,30};
        int n=value.length;
        int capacity=5;
        System.out.println(knapsack(weight, value, capacity));
    }
}
