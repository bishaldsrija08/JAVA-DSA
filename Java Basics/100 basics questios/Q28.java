// Write a program to find the product of all natural numbers from 1 to n.

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long product = 1;
        for(int i=1; i<=n; i++){
            product *= i;
        }
        System.out.println("Product of natural numbers from 1 to " + n + " is: " + product);
        sc.close();
    }
}