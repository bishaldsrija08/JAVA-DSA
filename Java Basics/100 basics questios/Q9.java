// Write a program to read the marks of 5 subjects and print the total and average.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double average;
        float mark1, mark2, mark3, mark4, mark5;
        System.out.print("Enter marks of subject 1: ");
        mark1 = sc.nextFloat();
        System.out.print("Enter marks of subject 2: ");
        mark2 = sc.nextFloat();
        System.out.print("Enter marks of subject 3: ");
        mark3 = sc.nextFloat();
        System.out.print("Enter marks of subject 4: ");
        mark4 = sc.nextFloat();
        System.out.print("Enter marks of subject 5: ");
        mark5 = sc.nextFloat();
        total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5;
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        sc.close();
    }
}
