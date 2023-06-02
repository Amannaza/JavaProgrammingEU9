package day18_Nested_Loop;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {//do not use if! Becouse it is only for one time.While is loop repaeating infinity times

            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Number is Even Number");
            } else {
                System.out.println("Number is Odd Number");
            }

            System.out.println("Would you like enter another number?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Please enter valid answer(yes/no):");
                a = input.next().toLowerCase();

            }

            if (a.equals("no")) {
                break;
            }

        }

        input.close();

    }
}
