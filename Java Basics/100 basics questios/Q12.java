// Write a program to read a number and check whether it is positive, negative or zero.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number==0){
            System.out.println("The number is zero.");
        }else if(number>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }
        sc.close();
    }
}