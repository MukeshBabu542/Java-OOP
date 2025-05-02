
import java.util.Scanner;


public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        func_tion(num);

    }

    public static void func_tion (int num) {
        
        int year = num/365;
        int rem = num%365;
        int months = rem/30;
        int days = rem%30;

    System.out.println("Year =" + year + "Months =" + months + "Days ="+ days);


    }

}
