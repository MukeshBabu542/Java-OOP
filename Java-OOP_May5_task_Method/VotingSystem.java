import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        func_tion(age);
    }

    public static void func_tion(int age) {
        String vote = (age>=18)? "You are eligible to vote.":"You are not eligible to vote.";
        System.out.println(vote);

    }
}
