import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;

        do {
            System.out.println("Enter any number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want to continue? If yes press 1, if No press any!");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}