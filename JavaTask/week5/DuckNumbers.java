import java.util.Scanner;

public class DuckNumbers {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        func_tion(num);
    }

    public static void func_tion(int num) {
        if (num > 0 && num % 10 != 0) {
            boolean isDuck = false;
            int originalNum = num;
            while (num > 0) {
                if (num % 10 == 0 && num != originalNum) {
                    isDuck = true;
                    break;
                }
                num /= 10;
            }
            if (isDuck) {
                System.out.println(originalNum + " is a Duck number.");
            } else {
                System.out.println(originalNum + " is not a Duck number.");
            }
        } else {
            System.out.println(num + " is not a Duck number.");
        }
    }