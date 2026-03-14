public class HouseRobber {
    public static int robber(int[] money,int i){
        if(i<0){
            return 0;
        }
        if(i==0){
            return money[0];
        }
        int include = money[i]+robber(money,i-2);
        int exclude = robber(money,i-1);
        return Math.max(include,exclude);
    }
    public static void main(String[] args) {
        int[] money = {10,10,10,10,10};
        int n = money.length;
        int result = robber(money,n-1);
        System.out.println(result);
    }
}
