// Write a program to display all the digits of a number n (one per line).

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        // To display digits forward, we need to reverse the number first
        int reversed = 0;
        while(n!=0){
            reversed = reversed*10 + n%10;
            n = n/10;
        }
        // Now display the reversed number's digits
        while(reversed!=0){
            int digit = reversed%10;
            System.out.println(digit);
            reversed = reversed/10;
        }
        sc.close();
    }
}