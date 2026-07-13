// Write a program to swap two numbers without using a third variable.
public class Q7 {
    public static void main(String[] args){
        int a =10;
        int b =5;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a+b; // a now becomes 15
        b=a-b; // b becomes 10
        a=a-b; // a becomes 5
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}