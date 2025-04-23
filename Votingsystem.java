
import java.util.Scanner;

public class Votingsystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age");
        int age= sc.nextInt();
        String vote = (age>=18)? "You are eligible to vote.":"You are not eligible to vote.";
        System.out.println(vote);
        sc.close();

    }
}
