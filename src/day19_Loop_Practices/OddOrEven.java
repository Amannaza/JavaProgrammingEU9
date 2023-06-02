package day19_Loop_Practices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("Would yoou like to enter new number? (yes/no)");
            String a = scan.next();

            if (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (a.equals("no")) {
                System.out.println("Thank you");
                break;
            }
            scan.close();
        }


    }
}