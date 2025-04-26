package JavaTask;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        boolean isPerfectSquare = false;

        for (int i = 0; i * i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

     
        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        input.close();
    }
}
