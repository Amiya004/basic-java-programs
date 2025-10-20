// Java program that displays the multiplication table from 1 to a given number (n)

import java.util.Scanner;

public class TableFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want the tables:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) { // runs from 1 to n (reprrsents each table)
            System.out.println("Table of " + i);
            System.out.println("--------------------------");

            for (int j = 1; j < 10; j++) { //runs from 1 to 10 (represents each multiplication table)
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println("--------------------------");
        }
    }
}
