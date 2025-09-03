import java.util.Scanner;

public class functionDemo {

    public static int helloWorld(int a, int b) { // formal parameters // parameters
        return (a + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hello = helloWorld(a, b); // actual paramerer or actual parameters
        System.out.println(hello);
    }
}