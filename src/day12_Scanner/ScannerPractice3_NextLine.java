package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");

        String name = input.nextLine();             //Wooden SpoonEnter


        System.out.println("Enter your programmin language:");
        String program = input.nextLine();            //Java Programmin LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt();            //24

        input.nextLine();            //Enter

        System.out.println("ENTER your school name:");
        String school = input.nextLine();          //Enter

        System.out.println("Full name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Age : " + age);
        System.out.println("school = " + school);
        input.close();
    }
}
