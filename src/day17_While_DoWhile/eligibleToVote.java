package day17_While_DoWhile;

import java.util.Scanner;

public class eligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();//-20    //Valid age 1~120
        while (!(age <= 120 && age >= 1)) {
            System.err.println("Invalid entry,re-enter:");
            age = input.nextInt();
        }

        System.out.println("Are US citizen? (yes/no)");
        String answer = input.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid.Re-enter :");
            answer = input.next();
        }

        if (age >= 18 && answer.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        input.close();

    }
}
