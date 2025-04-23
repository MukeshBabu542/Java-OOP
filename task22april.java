
import java.util.Scanner;

public class task22april {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentenceString = sc.nextLine();
        sc.close();
        int lenOfString = sentenceString.length();
        int countOfUpper = 0;
        int countOfLower = 0;
        for (int i=0; i< lenOfString; i++){
            char a=sentenceString.charAt(i);
            if (a >= 'a' && a<='z'){
                countOfLower++;
            } else if (a>='A' && a<='Z'){
                countOfUpper++;
            }

        } 
        System.out.println(countOfLower);
        System.out.println(countOfUpper);
    }
}
