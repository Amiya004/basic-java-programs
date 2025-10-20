// finding power of a number using math class


import java.util.Scanner;

public class PowerOfNumberMath {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = scanner.nextInt();

        long result = (long) Math.pow(base, exponent);

        System.out.println(base + "^" + exponent + "=" + result);
        
        scanner.close();
    }
}
