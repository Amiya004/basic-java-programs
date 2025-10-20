// Program to find the sum of ‘n’ Natural numbers.

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        if(n <= 0){
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("The sum of natural numbers from 1 to " + n + " is : " + sum);
        }
        scanner.close();

    }
}
