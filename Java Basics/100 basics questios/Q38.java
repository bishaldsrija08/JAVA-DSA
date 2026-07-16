// Write a program to find the largest digit in a number n.

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int largestDigit = Integer.MIN_VALUE;
        while(n!=0){
            int digit = n%10;
            if(digit > largestDigit){
                largestDigit = digit;
            }
            n=n/10;
        }
        System.out.println("Largest digit: " + largestDigit);
        sc.close();
    }
}