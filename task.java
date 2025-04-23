
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char variableName='a';
        System.out.print("Enter the age");
        int age= sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your gpa");
        double gpa= sc.nextDouble();
        char char1=sc.next().charAt(0);
        System.out.println(age);
        System.out.println(name);
        System.out.println(gpa);
        System.out.println(variableName);


        sc.close();
        

    }
}
