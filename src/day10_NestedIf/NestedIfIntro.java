package day10_NestedIf;

import day09_IfStatements.EligibleBuyAlcahol;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 75;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");
            } else {

                System.out.println("Failed");
            }
        } else {
            System.out.println("İnvalid");
        }

        System.out.println("--------------------------------------------------------");

        int age = 16;
        boolean hasId = true;

        if (hasId) {
            if (age >= 21) {
                System.out.println("Eligible to Buy Alcahol");

            } else {
                System.out.println("Not Eligible Buy Alcahol");
            }
        } else {
            System.out.println("İnvalid");
        }

        System.out.println("------------------------------------------------------");

        int number = 1;

        if (number >= 1 && number <= 7) { //if number is valid 1-7

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }else

    {
        System.out.println("İnvalid number");
    }


}


}
