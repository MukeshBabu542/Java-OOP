
import java.util.Scanner;

public class Replacevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        sc.close();
        String newString = " ";

        for (int i=0; i<sentence.length(); i++){}
        char ch = sentence.charAt(i);
          
        if (ch== 'a' || ch=='i' || ch=='o' || ch=='u'
        ){
            newString += '*';

        } else {
            newString += ch;
        }

        System.out.println("Modified sentence:" + newString);

        
        
    }
}
