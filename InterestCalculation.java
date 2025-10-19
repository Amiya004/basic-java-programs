// Program for Calculation of Simple & Compound Interest[Math] 

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principle amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter rate of interest ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter Time Period:");
        double time = scanner.nextDouble();

        // simple interest 
        double simpleInterest = (principal * interestRate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest) ;

        // compound Interest 
        double amount = principal * Math.pow((1 + interestRate / 100), time); 
        double compoundInterest = amount - principal;
        System.out.println("Compound amount:" +amount);
        System.out.println("Compound Interest is:" + compoundInterest);

        scanner.close();

    }
}