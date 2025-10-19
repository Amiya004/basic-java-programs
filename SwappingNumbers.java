// Program for Swapping of 2 variables using 3rd variable. 

import java.util.Scanner;


public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Provide your first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Provide your second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Before Swapping the value of the first number is "+num1+" and the value of second number is= "+num2);

        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping the value of the first number is "+num1+" and the value of second number is= "+num2);

    }
}


