public class UnboundedKnapsack {
    public static int unboundedKnapsack(int index,int capacity,int weight[],int value[]){
        if(index==0){
            return (capacity/weight[0])*value[0];
        }
        int nottake=unboundedKnapsack(index-1,capacity,weight,value);
        int take=Integer.MIN_VALUE;
        if(weight[index]<=capacity){
            take=value[index]+unboundedKnapsack(index,capacity-weight[index],weight, value);
        }
        return Math.max(take,nottake);
    }
    public static void main(String[] args) {
        int weight[]={2,3,4};
        int value[]={40,50,60};
        int index=value.length;
        int capacity=8;
        System.out.println(unboundedKnapsack(index-1, capacity, weight, value));
    }
}
