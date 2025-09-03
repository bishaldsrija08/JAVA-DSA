public class swap {

    public static void swapValues(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "a");
        System.out.println(b + "b");
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(a + "a");
        System.out.println(b + "b");

        System.out.println("After swapping: ");
        swapValues(a, b);
    }
}
