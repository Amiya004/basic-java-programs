// Program to find the Reverse of entered number.

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int remainder = 0, reverse = 0;
        while(number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder ;
            number = number / 10 ;
        }

        System.out.println("Reversed number is " + reverse);

        sc.close();
    }
}
