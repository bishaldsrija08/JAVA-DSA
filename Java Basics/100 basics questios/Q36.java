// Write a program to find the product of all digits of a number n.
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
            int digit = n%10;
            product *= digit;
            n=n/10;
        }
        System.out.println("Product of digits: " + product);
        sc.close();
    }
}