// Program to display the Natural numbers upto ‘n’ in reverse 
import java.util.Scanner;

public class NaturalNumberInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num =  scanner.nextInt();

        if(num <= 0){
            System.out.println("Please enter a positive integer!!!");
        }else{
            System.out.println("Natural numbers from 1 to " + num + "in reverse are:");

            for(int i = num; i>= 1; i--){
                System.out.println(i + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
