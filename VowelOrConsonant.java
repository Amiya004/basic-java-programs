// Program to check entered alphabet Vowel/Consonant.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet : ");
        char ch = sc.next().charAt(0);

        // it checks the alphabet is between A-Z or a-z
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            // checks Vowel or consonant
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("This is a vowel");
            } else{
                System.out.println("This is a consonant");
            }
        } else {
            System.out.println("This is not an alphabet !!!");
        }

        sc.close();
    }
}
