// Program to find Greatest number among 2 numbers.

import java.util.Scanner;

public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number : ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greatest");
        } else {
            System.out.println(num2 + " is greatest");
        }

        scanner.close();
    }
}
