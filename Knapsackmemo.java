public class Knapsackmemo {
   static int knapsack(int index,int capacity,int weight[],int value[]){
        if(index==0){
            if(weight[0]<=capacity)
                return value[0];
                return 0;
            }
            int nottake=knapsack(index-1,capacity,weight,value);
            int take=Integer.MIN_VALUE;
            if(weight[index]<=capacity){
                take=value[index]+knapsack(index-1,capacity-weight[index],weight, value);
            }
            return Math.max(take,nottake);
            
    }
    public static void main(String[] args) {
        int weight[]={3,2,4,1};
        int value[]={60,40,70,30};
        int index=value.length;
        int capacity=5;
        System.out.println(knapsack(index-1, capacity, weight, value));
    }
}