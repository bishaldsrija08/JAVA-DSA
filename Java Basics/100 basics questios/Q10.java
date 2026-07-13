// Write a program to read seconds and convert them into hours, minutes and seconds.

import java.util.Scanner;

public class Q10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remainingSeconds);
        sc.close();
    }
}