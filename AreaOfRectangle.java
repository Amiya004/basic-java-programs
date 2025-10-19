// 2. Program to find the Area of Rectangle

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the rectangle:");
        int height = scanner.nextInt();

        System.out.println("Enter the width of the rectangle:");
        int width = scanner.nextInt();

        int area = height * width ;
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}