// Write a program to read the length and breadth of a rectangle and print its area and perimeter.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.println("Enter breadth of rectangle: ");
        float breadth = sc.nextFloat();
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        System.out.println("The area of rectangle is: " + area);
        System.out.println("The perimeter of rectangle is: " + perimeter);
        sc.close();
    }
}
