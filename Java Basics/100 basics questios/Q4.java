// Write a program to read the radius of a circle and print its area and circumference.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        float area = (float) (Math.PI * radius * radius);
        float circumference = (float) (2 * Math.PI * radius);
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        sc.close();
    }
}