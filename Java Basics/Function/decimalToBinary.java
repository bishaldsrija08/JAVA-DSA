public class decimalToBinary {
    public static void main(String[] args) {
        int n = 20;
        int binary = 0;
        int power = 0;

        while (n > 0) {
            int reminder = n % 2;
            binary = binary + 10 * (reminder * (int) Math.pow(10, power));
            n = n / 2;
            power++;
        }
        System.out.println(binary);
    }
}