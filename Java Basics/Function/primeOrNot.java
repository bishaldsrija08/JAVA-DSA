import java.util.Scanner;

public class primeOrNot {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if (result) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
