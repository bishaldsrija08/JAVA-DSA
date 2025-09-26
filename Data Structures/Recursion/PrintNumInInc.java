public class PrintNumInInc {
    public static void main(String[] args) {
        int n = 10;
        printNumInIncre(n);
    }

    public static void printNumInIncre(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumInIncre(n - 1);
        System.out.print(n + " ");
    }
}
