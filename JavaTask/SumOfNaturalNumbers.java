package JavaTask;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }

        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        input.close();
    }
}
