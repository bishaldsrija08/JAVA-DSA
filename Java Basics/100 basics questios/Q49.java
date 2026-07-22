// Write a program to check whether a number is a perfect number.

// A strong number (or Krishnamurthy number) is a positive integer whose sum of the factorial of its digits equals the number itself.

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        sc.close();
    }
}