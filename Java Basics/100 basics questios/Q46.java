// Write a program to display the first n prime numbers.

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("First " + n + " prime numbers are: ");

        for(int i = 2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}