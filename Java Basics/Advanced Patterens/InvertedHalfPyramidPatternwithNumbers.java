import java.util.Scanner;

public class InvertedHalfPyramidPatternwithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the inverted half pyramid: ");
        int n = sc.nextInt();
        printInvertedHalfPyramid(n);
    }

    public static void printInvertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}