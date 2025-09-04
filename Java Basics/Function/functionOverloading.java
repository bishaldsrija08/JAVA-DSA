public class functionOverloading {

    // Function to calculate sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function to calculate sum of three numbers
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(6, 7));
        System.out.println(sum(6.3f, 7.6f));

    }
}
