// Program to display Odd numbers upto ‘n’.

import java.util.Scanner;

public class OddNumbersUptoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which Odd numbers will be displayed: ");
        int num = scanner.nextInt();

        System.out.println("Odd numbers upto " + num + "are: ");
        for(int i = 1; i <= num ; i++){
            if(i % 2 != 0) {
                System.out.println(i + " ");
            }
        }

        scanner.close();
    }    
}
