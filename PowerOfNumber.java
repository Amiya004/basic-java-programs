// Program to find the Power of a number. 

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        long result = 1; 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = scanner.nextInt();

        for(int i = 1; i <= exponent; i++){
            result = result * base ;
        }

        System.out.println(base + "^" + exponent + "=" + result);
        
        scanner.close();
    }
}
