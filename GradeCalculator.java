// Program to calculate grade from marks in 3 subjects.

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double math, physics, chemistry;

        System.out.print("Enter marks in Math (0-100): ");
        math = scanner.nextDouble();
        if (math < 0 || math > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter marks in Physics (0-100): ");
        physics = scanner.nextDouble();
        if (physics < 0 || physics > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter marks in Chemistry (0-100): ");
        chemistry = scanner.nextDouble();
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }

        double total = math + physics + chemistry; // total marks 

        double percentage = (total / 300) * 100; //determine percentage

        System.out.println("\nTotal Marks: " + total + " / 300");
        System.out.printf("Percentage : %.2f%%\n", percentage );
        // System.out.printf() ➜ prints formatted text, where you can control decimal places, alignment, and precision — just like in C or C++.

        
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
