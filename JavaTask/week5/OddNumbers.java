import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        func_method(num);
        
    }

    public static void func_method(int num) {
        for(int i=1; i<=num; i++){

            if(i%2!=0){
            System.out.println(i);
            }
        }

        
    }
}