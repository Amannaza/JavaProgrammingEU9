package day12_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = input.nextInt();

        input.nextLine();           //Close Scanner

        System.out.println("Enter the full name:");
        String name = input.nextLine();

        System.out.println("Enter your GPA:");
        double GPA = input.nextDouble();

        input.nextLine();           //Enter

        System.out.println("Enter your School name:");
        String school = input.nextLine();

        input.close();              //Close Scanner

        System.out.println("age = " + age);
        System.out.println("Full name = " + name);
        System.out.println("GPA = " + GPA);


    }
}
