package day18_Nested_Loop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number:");
            int num1 = input.nextInt();

            System.out.println("Enter your second number:");
            int num2 = input.nextInt();

            System.out.println("Addition=" + (num1 + num2));

            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid answer.Would you like to continue?");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }


        input.close();

    }
}
