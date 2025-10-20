// Print fibonacci series

// The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with \(0\) and \(1\). The sequence begins 0,1,1,2,3,5,8,13,21,...

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number upto which you want to print : ");
        int num = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series upto " + num + " : ");

        for (int i = 1; i <= num ; i++) {
            System.out.println(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }    
}
