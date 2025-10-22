// Login Problem 

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String storedUsername = "admin";
        String storedPassword = "admin123";

        System.out.print("Enter Username : ");
        String username = sc.next();

        System.out.print("Enter Password : ");
        String password = sc.next();

        if(username.equals(storedUsername) && password.equals(storedPassword)) 
        {
            System.out.println("Login Successful...");
        } 
        else if(!username.equals(storedUsername) && password.equals(storedPassword)) 
        {
            System.out.println("Invalid Username!!!");
        }
        else if(username.equals(storedUsername) && !password.equals(storedPassword)) 
        {
            System.out.println("Invalid Password!!!");
        }
        else 
        {
            System.out.println("Invalid Username and Paswword !!!, Please try again...");
        }

        sc.close();
    }
}
