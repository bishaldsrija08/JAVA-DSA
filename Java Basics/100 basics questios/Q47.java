// Write a program to check whether a number is an Armstrong number.

import java.util.Scanner;
import static java.lang.Math.pow;
public class Q47 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int result = 0;
        while(n!=0){
            int digit = n%10;
            result = result +  (int)pow(digit, 3);
            n = n/10;
        }
        if(result==originalNumber){
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        sc.close();
    }
}
