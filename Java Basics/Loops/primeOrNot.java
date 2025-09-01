import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            isPrime = true;
        } else if (n == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime!");
        } else {
            System.out.println("Not prime!");
        }
    }
}