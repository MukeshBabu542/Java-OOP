package JavaTask;

import java.util.Scanner;

public class DivisibleByBoth5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num % 5==0 && num % 11==0){
            System.out.println(" is divisible by both 5 and 11.");

        } else {
            System.out.println(" is not divisible by both 5 and 11");

        }
        sc.close();


    }
}
