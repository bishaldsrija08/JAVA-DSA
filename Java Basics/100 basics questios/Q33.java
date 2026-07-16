// Write a program to count the number of digits in a number n.

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}