// Program to find the Factorial of entered number. 

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int num = scanner.nextInt();

        long factorial = 1; // Use long to handle large results

        for(int i = 1; i <= num; i++){
            factorial = factorial * i ;
        }

        System.out.println("Factorial of " + num + " is = (" + factorial + ")");

        scanner.close();
    }
}
