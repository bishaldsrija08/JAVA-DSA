// Write a program to count how many numbers from 1 to n are divisible by 3.

import java.util.Scanner;

public class Q31 {
    public static void main(String[]args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%3==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}