import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int n = sc.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println("Factorial is 1");
        } else {
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
        }
        System.out.println("Factorial is: " + fact);
    }
}
