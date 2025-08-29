import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println("The area is " + area);
    }
}
