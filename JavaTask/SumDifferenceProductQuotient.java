package JavaTask;

import java.util.Scanner;

public class SumDifferenceProductQuotient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter your seconf number");
        double num2 = sc.nextDouble();

        double sum = num1+num2;
        double difference = num1-num2;
        double product = num1*num2;



        sc.close();
    }
}
