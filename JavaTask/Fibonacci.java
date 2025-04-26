package JavaTask;

import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();

        
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        
        if (n >= 1) {
            System.out.print(first + " ");
        }

        
        if (n >= 2) {
            System.out.print(second + " ");
        }

        
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second; 

            
            first = second;
            second = nextTerm;
        }

        input.close();
    }
}
