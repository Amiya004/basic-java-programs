// Program to check entered number Prime/Composite. 

// A prime number is a whole number greater than 1 that has only two factors: 1 and itself. A composite number is a whole number greater than 1 that has more than two factors.

import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check is it a (prime) or a (composite) number : ");
        int number = scanner.nextInt();

        if(number <= 1){
            System.out.println(number + " is neither a PRIME nor a COMPOSITE number !!!");
        } else {
            boolean isPrime = true;

            for(int i=2; i<number; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(number + " is a PRIME NUMBER...");
            } else {
                System.out.println(number + " is  a COMPOSITE NUMBER...");
            }
        }

        scanner.close();
    }
}
