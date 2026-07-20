// Write a program to display all Armstrong numbers from 1 to n.

import java.util.Scanner;

public class Q48 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers from 1 to " + n + " are: ");
        for(int i=1; i<=n; i++){
            int originalNumber = i;
            int result =0;
            while(originalNumber!=0){
                int digit = originalNumber%10;
                result = result + (int)Math.pow(digit, 3);
                originalNumber = originalNumber/10;
            }
            if(result==i){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
