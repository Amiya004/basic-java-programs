// Program to Check the entered alphabet Uppercase/Lowercase. 

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("The entred aplphabet is UPPERCASE");
        } else if(ch >= 'a' && ch <= 'z'){
            System.out.println("The entered alphabet is LOWERCASE");
        } else {
            System.out.println("PLEASE ENTER A ALPHABET !!!");
        }

        sc.close();
    }
}
