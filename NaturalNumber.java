// Program to display the Natural numbers upto ‘n’. 
import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num =  scanner.nextInt();

        if(num <= 0){
            System.out.println("Please enter a positive integer!!!");
        }else{
            System.out.println("Natural numbers from 1 to" + num + "are:");

            for(int i = 1; i<= num; i++){
                System.out.println(i + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
