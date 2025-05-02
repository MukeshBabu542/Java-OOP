import java.util.Scanner;

public class KaprekarNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        func_tion(num);
    }

    public static void func_tion(int num) {
        int square = num * num;
        int numDigits = String.valueOf(num).length();
        int rightPart = square % (int) Math.pow(10, numDigits);
        int leftPart = square / (int) Math.pow(10, numDigits);
        
        if (leftPart + rightPart == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    }
}
