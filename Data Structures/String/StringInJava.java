import java.util.Scanner;

public class StringInJava {
    public static void main(String[] args) {
        char arr[] = { 'b', 'i', 's', 'h', 'a', 'l' };
        String str = new String("Bishal");
        // System.out.println(str);
        // String str1 = "Rijal";
        // System.out.println(str1);
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printLetters(name);
        sc.close();
    }

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}