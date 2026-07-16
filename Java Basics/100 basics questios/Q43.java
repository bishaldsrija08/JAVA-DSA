// Write a program to find the sum of the first and last digit of a number n.

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int lastDigit = n % 10;
             while (n >= 10) {
                n /= 10;
             }
             int firstDigit = n;
             int sum = firstDigit + lastDigit;
             System.out.println("Sum of first and last digit: " + sum);
        sc.close();
    }
}