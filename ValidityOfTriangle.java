// Program to check the Validity of Triangle.

import java.util.Scanner;

public class ValidityOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle : ");
        int angle1 = scanner.nextInt();

        System.out.println("Enter the second angle : ");
        int angle2 = scanner.nextInt();

        System.out.println("Enter the third angle : ");
        int angle3 = scanner.nextInt();

        if(angle1+angle2 > angle3 && angle1+angle3 > angle2 && angle2+angle3 > angle1) {
            System.out.println("The sides from a valid Triangle...");
        }else{
            System.out.println("The angles does not form a valid Triangle!!!");
        }

        scanner.close();
    }
}
