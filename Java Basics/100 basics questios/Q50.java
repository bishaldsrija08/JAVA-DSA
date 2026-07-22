// Write a program to check whether a number is a strong number (sum of factorials of its digits)

// A perfect number is a positive integer that is exactly equal to the sum of its proper positive divisors (excluding the number itself).

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum = sum + fact;
            num = num / 10;
        }

        if(sum == originalNum) {
            System.out.println(originalNum + " is a strong number.");
        } else {
            System.out.println(originalNum + " is not a strong number.");
        }
        sc.close();
    }
}