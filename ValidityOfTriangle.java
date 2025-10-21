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

        int sum = angle1 + angle2 + angle3;
        if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The sides form a valid Triangle...");
        }else{
            System.out.println("The angles does not form a valid Triangle!!!");
        }

        scanner.close();
    }
}
