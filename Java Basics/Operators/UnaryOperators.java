public class UnaryOperators {
    public static void main(String[] args){
        int a = 10;
        int b = ++a; // Pre-increment: a is incremented before assignment to b

        int c = 10;
        int d = c++; // Post-increment: c is assigned to d before incrementing c

        System.out.println(a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(d);
    }
}
