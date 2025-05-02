
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();
        func_tion(input);
        
    }

    public static void func_tion(String str) {
        int count = 0;
        boolean inWord = false;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch != ' '){
                if (!inWord){
                    count++;
                    inWord = true;

                }
            } else {
                inWord = false;
            }
        }
        
        System.out.println("Number of words =" + count);
    }
}
