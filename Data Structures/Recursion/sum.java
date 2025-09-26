public class sum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sume(n));

    }

    public static int sume(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sume(n - 1);
    }
}