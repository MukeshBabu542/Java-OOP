package JavaTask;

import java.util.Scanner;

public class MarksCalculating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter marks for Subject 1: ");
        float subject1 = input.nextFloat();

        System.out.print("Enter marks for Subject 2: ");
        float subject2 = input.nextFloat();

        System.out.print("Enter marks for Subject 3: ");
        float subject3 = input.nextFloat();

        System.out.print("Enter marks for Subject 4: ");
        float subject4 = input.nextFloat();

        System.out.print("Enter marks for Subject 5: ");
        float subject5 = input.nextFloat();

        
        float total = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (total / 500) * 100; 

        
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
