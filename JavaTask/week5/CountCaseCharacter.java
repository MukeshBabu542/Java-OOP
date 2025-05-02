import java.util.Scanner;

public class CountCaseCharacter {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        func_tion(str);
    }

    public static void func_tion(String str) {
        int upperCount = 0;
        int lowerCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }
        
        System.out.println("Uppercase characters: " + upperCount);
        System.out.println("Lowercase characters: " + lowerCount);
    }
}
