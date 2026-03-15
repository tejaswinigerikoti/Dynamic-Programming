import java.util.Arrays;

public class BagpackMemo {
   static int knapsack(int index,int capacity,int weight[],int value[],int dp[][]){
        if(index==0){
            if(weight[0]<=capacity)
                return value[0];
                return 0;
            }
             if(dp[index][capacity]!=-1){
            return dp[index][capacity];
    }
            int nottake=knapsack(index-1,capacity,weight,value,dp);
            int take=Integer.MIN_VALUE;
            if(weight[index]<=capacity){
                take=value[index]+knapsack(index-1,capacity-weight[index],weight, value,dp);
            }
            dp[index][capacity]= Math.max(take,nottake);
            return  dp[index][capacity];
            
    }
    public static void main(String[] args) {
        int weight[]={3,2,4,1};
        int value[]={60,40,70,30};
        int index=value.length;
         int capacity=5;
        int dp[][]=new int[index][capacity+1];
       for(int i=0;i<index;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(knapsack(index-1, capacity, weight, value,dp));
    }
}
