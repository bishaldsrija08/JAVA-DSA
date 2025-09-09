import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Computer " + marks[0]);
        System.out.println("Science " + marks[1]);
        System.out.println("Java " + marks[2]);

        int per = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage " + per + "%");
        System.out.println("Lengh of array: " + marks.length);
    }
}