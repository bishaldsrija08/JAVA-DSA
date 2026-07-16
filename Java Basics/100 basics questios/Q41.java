// Write a program to reverse and check palindrome of a number n.
import java.util.Scanner;

public class Q41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n=n/10;
        }
        System.out.println("Reversed number: " + reverse);
        if(originalNumber == reverse){
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        sc.close();
    }
}