// Program to check if the number is positive, negative or zero. 

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is a POSITIVE NUMBER");
        } else if(num < 0) {
            System.out.println(num + " is a NEGATIVE NUMBER");
        } else {
            System.out.println("The number is 0");
        }

        sc.close();
    }
}
