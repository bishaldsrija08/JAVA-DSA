import java.util.Scanner;

public class productOfAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = product(a, b); // caling statement
        System.out.println(result);

    }

    public static int product(int a, int b) { // Defining function
        return a * b;
    }
}