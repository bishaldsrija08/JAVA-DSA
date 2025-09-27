import java.util.Scanner;

public class nfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        for(int i =0; i<=n; i++){
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
