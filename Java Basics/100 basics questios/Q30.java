// Write a program to display all multiples of a number m up to n terms.

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display its multiples: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            System.out.println(m + " x " + i + " = " + (m*i));
        }
        sc.close();
    }
}