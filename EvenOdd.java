
import java.util.Scanner;

// Program to check the entered number even or odd.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }

        sc.close();
    }
}
