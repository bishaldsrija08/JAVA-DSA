import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int n = sc.nextInt();
        int decimal = binaryToDecimalFn(n);
        System.out.println("Decimal of " + n + " is: " + decimal);
    }

    public static int binaryToDecimalFn(int n) {
        int decimal = 0;
        int power = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal = (int) (decimal + lastDigit * Math.pow(2, power));
            n = n / 10;
            power++;
        }
        return decimal;
    }
}