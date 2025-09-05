import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = sc.nextInt();
        checkPalindrome(n);
    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }

    public static void checkPalindrome(int n) {
        int reversedNumber = reverse(n);
        if (n == reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}