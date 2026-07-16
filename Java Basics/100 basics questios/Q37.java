// Write a program to reverse a number n.
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n=n/10;
        }
        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}