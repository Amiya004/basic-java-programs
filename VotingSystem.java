// Program for voting system

// Program for voting system

import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("You are not eligible to vote!!!");
        } else if (age >= 18 && age < 100) {
            System.out.println("You are ready to vote...");
        } else if (age >= 100) {
            System.out.println("[X_X] Maybe it's time to rest, not vote!");
        } else {
            System.out.println("Invalid age entered!");
        }

        scanner.close();
    }
}
