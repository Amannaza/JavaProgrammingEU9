package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name:");
        String userName = input.next();

        System.out.println("Enter password:");
        String password = input.next();

        for (int i = 1; i <= 3; i++) {

            if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Loggen in");
                break;

            }
            System.out.println("Incorrect user name or password.Try again:");
            System.out.println("Enter user name:");
            userName = input.next();

            System.out.println("Enter password:");
            password = input.next();

            if (i == 3) {
                System.out.println("Account locked.Contact costumer service");
            }

        }
        input.close();


    }
}
