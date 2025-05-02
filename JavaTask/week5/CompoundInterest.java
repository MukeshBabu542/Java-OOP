import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount");
        float Principal = sc.nextFloat();

        System.out.println("Enter Rate of intrest");
        float rate = sc.nextFloat();

        System.out.println("Enter Time in years");
        int time = sc.nextInt();

        func_tion(Principal,rate,time);

        
    }

    public static void func_tion(float p,float r, int t) {
        float base = 1+r/100;
        float multiplier = 1;

            for (int i = 0; i < t; i++) {
             multiplier = multiplier * base;
        }

                float amount = p * multiplier;
                float compoundInterest = amount - p;

                System.out.println("Compound Interest = " + compoundInterest);
                System.out.println("Total Amount = " + amount);
            }
        
    }

