import java.util.Scanner;

public class Palindrome {
    public class PalindromePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        func_tion(num);
    }

    public static void func_tion(int num) {
        if (isPalindrome(num) && isPrime(num)) {
            System.out.println(num + " is a Palindrome Prime.");
        } else {
            System.out.println(num + " is NOT a Palindrome Prime.");
        }
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    }
}
