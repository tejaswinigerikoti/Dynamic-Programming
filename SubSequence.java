public class SubSequence {
    public static int solve(int i, int j, String s1, String s2) {
        if(i<0 || j<0){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solve(i-1, j-1, s1, s2);
        }
        int skipfirst=solve(i-1, j, s1, s2);
        int skipsecond=solve(i, j-1, s1, s2);
        return Math.max(skipfirst, skipsecond);
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="acde";
        int n=s1.length();
        int m=s2.length();
        System.out.println("Subsequence is : " + solve(n-1, m-1, s1, s2));
    }
}
