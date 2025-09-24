import java.util.Scanner;

public class HowManyVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) == 'a' || Character.toLowerCase(text.charAt(i)) == 'e' || Character.toLowerCase(text.charAt(i)) == 'i' || Character.toLowerCase(text.charAt(i)) == 'o' || Character.toLowerCase(text.charAt(i)) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}