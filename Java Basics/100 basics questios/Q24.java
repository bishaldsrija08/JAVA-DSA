// Write a program to display all odd numbers from 1 to n.

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Odd numbers from 1 to " + n + " are: ");
        for(int i=1; i<=n; i+=2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}