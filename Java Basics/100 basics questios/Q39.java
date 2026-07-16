// Write a program to find the smallest digit in a number n.

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int smallestDigit = Integer.MAX_VALUE;
        while(n!=0){
            int digit = n%10;
            if(digit < smallestDigit){
                smallestDigit = digit;
            }
            n=n/10;
        }
        System.out.println("Smallest digit: " + smallestDigit);
        sc.close();
    }
}