import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter marks for four subjects
        System.out.print("Enter marks for Subject 1: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double mark3 = input.nextDouble();

        System.out.print("Enter marks for Subject 4: ");
        double mark4 = input.nextDouble();

        // Calculate average
        double average = (mark1 + mark2 + mark3 + mark4) / 4;

        // Determine grade
        String grade;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display results
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

        input.close();
    }
}