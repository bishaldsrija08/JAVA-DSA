// Write a program to display all numbers from 1 to n that are divisible by 3 or 5.

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}