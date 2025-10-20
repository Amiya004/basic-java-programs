// Program to find the Reverse of entered digit.

import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int number = sc.nextInt();

        int remainder = 0, reverse = 0;
        while(number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder ;
            number = number / 10 ;
        }

        System.out.println("Reversed digit is " + reverse);

        sc.close();
    }
}
