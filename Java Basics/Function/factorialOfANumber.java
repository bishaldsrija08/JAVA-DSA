import java.util.Scanner;

public class factorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a rumber: ");
        int r = sc.nextInt();

        int binomialCoefficient = binomialCoefficient(n, r);
        System.out.println(binomialCoefficient);
    }

    public static int factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nmrFact = factorial(n - r);
        return nFact / (rFact * nmrFact);
    }
}
