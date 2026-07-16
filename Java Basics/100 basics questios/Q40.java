// Write a program to count the number of even digits and odd digits in a number n.

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args){
        int evenCount = 0;
        int oddCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while(n!=0){
            int digit = n%10;
            if(digit%2==0){
                evenCount++;
            } else {
                oddCount++;
            }
            n=n/10;
        }
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
        sc.close();
    }
}