// Write a program to find the sum of all even numbers from 1 to n.

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=2; i<=n; i+=2){
            sum +=i;
        }
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}