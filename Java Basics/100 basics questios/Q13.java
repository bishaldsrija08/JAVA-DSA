// Write a program to read three numbers and find the largest among them.

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        if(num1==num2 && num2==num3){
            System.out.println("All three numbers are equal.");
        }else if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the largest number.");
        }else if(num2>num3){
            System.out.println(num2 + " is the largest number.");
        }else{
            System.out.println(num3 + " is the largest number.");
        }
        sc.close();
    }
}