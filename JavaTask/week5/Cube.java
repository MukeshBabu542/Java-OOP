import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        func_tion(num);
    }

    public static void func_tion(int num) {
        int result = num * num * num;
        System.out.println("Cube of " + num + " is: " + result);
    }  
}
