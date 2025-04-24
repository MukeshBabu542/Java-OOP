package JavaTask;

import java.util.Scanner;

public class NameWithGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name");
        String fullname = sc.nextLine();

        System.out.println("Hello,"+ fullname + " welcome");
        sc.close();
    }
}
