// Write a program to read the age of a person and check whether they are eligible to vote.

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}