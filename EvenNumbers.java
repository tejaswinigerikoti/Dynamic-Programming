import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if((n / 2) * 2 == n){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}