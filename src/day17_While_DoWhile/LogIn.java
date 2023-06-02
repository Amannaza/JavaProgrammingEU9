package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        //username: "Cydeo"
        //password:"Cydeo123"
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {

            int attempt = 3;//3,2,1

            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {
                System.out.println("Incorrect user name or password.Repeat again");
                if (attempt == 1) {
                    System.out.println("This is your last chance");
                }

                System.out.println("Enter your username:");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();
                attempt--;
            }

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Your account is locked!");
        }        }


        input.close();
    }
}
