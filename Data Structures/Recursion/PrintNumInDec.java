public class PrintNumInDec {

    public static void main(String[] args) {
        int n = 10; // Example input
        printNumDec(n);
    }

    public static void printNumDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumDec(n - 1);
    }
}