// Write a program to display all the digits of a number n (one per line).

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while(n!=0){
            int digit = n%10;
            System.out.println(digit);
            n=n/10;
        }
        sc.close();
    }
}