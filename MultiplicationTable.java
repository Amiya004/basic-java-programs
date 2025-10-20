// Program to display multiplication table of any number using loop

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        sc.nextLine();
        
        System.out.println("-------------------------");
        for(int i=1; i<=10; i++){
            System.out.println(number + "X" + i + "=" + number*i);
        }
        System.out.println("-------------------------");

        sc.close();
    }
}
