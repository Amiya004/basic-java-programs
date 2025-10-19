// 1. Program for Arithmetic operations with initialized values. 

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("            Choose a option:            ");
        System.out.println("***********************************************");
        System.out.println("        1. Addition             "); // sum
        System.out.println("        2. Subtraction             "); // difference
        System.out.println("        3. Multiplication             "); // product
        System.out.println("        4. Division             "); // quotient
        System.out.println("        5. Modulus              "); // remainder
        System.out.println("***********************************************");
        int choice = scanner.nextInt();
        System.out.println("-----------------------------------------------");

        switch(choice){
            case 1:
                System.out.println("Addition:" + (num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction:" + (num1 - num2));
                break;

            case 3:
                System.out.println("Multiplication:" + (num1 * num2));
                break;

            case 4:
               if(num2 != 0){
                 System.out.println("Division:" + (num1 / num2));
               }else{
                System.out.println("Error!!! Division by 0 is not allowed!!!");
               }
               break;

            case 5:
                if(num2 != 0){
                    System.out.println("Addition:" + (num1 % num2));
                }else {
                    System.out.println("Error!!! Modulus by 0 is not allowed!!!");
                }
                break;
            
            default:
                System.out.println("Invalid Choice !!! Please Select Between 1 and 5 ");
        }

        scanner.close();
        



    }
}