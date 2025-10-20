// Program to find the sum of numbers of entered digit. 

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0 , rem;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        while(num != 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of digits : " + sum);

        scanner.close();
    }
}
