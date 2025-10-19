//  3. Program to find Area of the Circle

import java.util.Scanner;

public class AreaOfCircle {

    public static final double PI = 3.14; //constant
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Area of the circle is:" + area);
        scanner.close();
    }
}
