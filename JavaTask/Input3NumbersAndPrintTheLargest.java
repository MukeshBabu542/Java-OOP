package JavaTask;

import java.util.Scanner;

public class Input3NumbersAndPrintTheLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
        System.out.println(" first number is greater then second and third number");

        } else if(num2>num1 && num2>num3){
            System.out.println(" second number is greater then first and third number");

        } else{
            System.out.println(" third number is greater then first and second number");
        }

        sc.close();

        
    }
}
