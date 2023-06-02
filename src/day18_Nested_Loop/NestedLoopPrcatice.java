package day18_Nested_Loop;

import java.util.Scanner;

public class NestedLoopPrcatice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your age:");
            int age = input.nextInt();

            while (!(age > 1 && age < 120)) {//while age is anvalid re-enter
                System.out.println("Please re-enter valid age:");
                age = input.nextInt();

            }

            if (age > 18) {
                System.out.println("You can buy alcohol");
            } else {
                System.out.println("You can not buy alcohol");
            }

            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();


            while (!(a.equals("yes") || a.equals("no"))) {//while answer is in valid
                System.err.println("Invalid entry.Would you like to continue?");
                a = input.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }

        }
        input.close();
    }


}

