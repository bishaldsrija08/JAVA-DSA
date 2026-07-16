// Write a program to display all natural numbers from 1 to n in reverse order.

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers from " + n + " to 1 in reverse order:");
        for(int i = n; i >= 1; i--){
            System.out.print(i + " ");
        }
        sc.close();
    }
}