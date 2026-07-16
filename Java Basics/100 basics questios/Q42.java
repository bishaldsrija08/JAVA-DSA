// Write a program to replace all zeros in a number n with the digit 5.

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = 0;
        int place = 1;
        while (n >0) {
            int digit = n % 10;
            if (digit == 0){
                result = result + 5 * place;
            } else {
                result = result + digit * place;
            }
            place *= 10;
            n /= 10;
        }
        System.out.println("Number after replacing zeros with 5: " + result);
        sc.close();
    }
}
